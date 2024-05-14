package mackmilhas.com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "reserva")
public class ReservaEntity {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    @Column(name = "id_pessoa", nullable = false)
    private Long id_pessoa;
    @OneToOne
    @Column(name = "id_passagem", nullable = false)
    private Long id_passagem;

    public ReservaEntity(Long id, Long id_pessoa, Long id_passagem) {
        this.id = id;
        this.id_pessoa = id_pessoa;
        this.id_passagem = id_passagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Long id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public Long getId_passagem() {
        return id_passagem;
    }

    public void setId_passagem(Long id_passagem) {
        this.id_passagem = id_passagem;
    }
}
