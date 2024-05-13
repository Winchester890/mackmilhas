package mackmilhas.com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "passagem")
public class PassagemEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "origem", nullable = false)
    private String origem;
    @Column(name = "destino", nullable = false)
    private String destino;
    @Column(name = "data", nullable = false)
    private String data;
    @Column(name = "preco", nullable = false)
    private Double preco;

    public PassagemEntity(Long id, String origem, String destino, String data, Double preco) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
