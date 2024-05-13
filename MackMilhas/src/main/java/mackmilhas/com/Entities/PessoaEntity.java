package mackmilhas.com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")
public class PessoaEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "senha", nullable = false)
    private String senha;

    public PessoaEntity(Long id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
