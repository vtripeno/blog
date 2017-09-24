package br.com.back.blog.model;

import br.com.back.blog.dominio.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface PessoaDao extends JpaRepository<Pessoa, Long> {

    /**
     * Método para encontrar pessoa por email
     * @param email
     * @return
     */
    public Pessoa findByEmail(String email);

}
