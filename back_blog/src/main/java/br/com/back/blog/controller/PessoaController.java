package br.com.back.blog.controller;

import br.com.back.blog.dominio.Pessoa;
import br.com.back.blog.model.PessoaDao;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class PessoaController {

    @Autowired
    PessoaDao pessoaDao;

    @RequestMapping("/salvarPessoa")
    @ResponseBody
    public boolean salvarPessoa(@RequestBody Pessoa pessoa) {

        if(StringUtils.isNullOrEmpty(pessoa.getEmail()) ||
                StringUtils.isNullOrEmpty(pessoa.getNome()) ||
                StringUtils.isNullOrEmpty(pessoa.getIp()) ) {
            return false;
        }

        boolean criou;

        if(!getByEmail(pessoa.getEmail())) {
            create(pessoa);
            criou = true;
        } else {
            criou = false;
        }


        return criou;

    }

    public boolean getByEmail(String email) {
        Pessoa pessoa = new Pessoa();
        try {
            pessoa = pessoaDao.findByEmail(email);
        }
        catch (Exception ex) {
            throw ex;
        }

        return pessoa != null ? true : false;
    }

    public void create(Pessoa pessoa) {
        try {
            LocalDateTime hoje = LocalDateTime.now();
            DateTimeFormatter formatador =
                    DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            pessoa.setDataCriacao(hoje.format(formatador));
            pessoaDao.save(pessoa);
        }
        catch (Exception ex) {
            throw ex;
        }
    }


}
