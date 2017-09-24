package br.com.back.blog.dominio;

//import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Pessoa")
public class Pessoa {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    //@NotNull
    @Column(name = "nome")
    private String nome;

    //@NotNull
    @Column(name = "ip")
    private String ip;

   //@NotNull
    @Column(name = "email")
    private String email;

    //@NotNull
    @Column(name = "dataCriacao")
    private String dataCriacao;

    public Pessoa() {}

    public Pessoa(Long id, String nome, String ip, String email, String dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.ip = ip;
        this.email = email;
        this.dataCriacao = dataCriacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
