package mackmilhas.com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "reserva")
public class ReservaEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "id_pessoa", nullable = false)
    private Long idPessoa;
    @Column(name = "id_passagem", nullable = false)
    private Long idPassagem;

    public ReservaEntity() {
    }

    public ReservaEntity(Long id, Long id_pessoa, Long id_passagem) {
        this.id = id;
        this.idPessoa = id_pessoa;
        this.idPassagem = id_passagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Long getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(Long idPassagem) {
        this.idPassagem = idPassagem;
    }
}
