package br.com.codgestao.api.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class Tgfest {

    @EmbeddedId
    private TgfestId id;

    @Column(name = "ESTOQUE", columnDefinition = "FLOAT")
    private Double estoque;

    public Long getProduto() {
        return id != null ? id.getCodProd() : null;
    }

    public void setProduto(Long codProd) {
        if (id == null) id = new TgfestId();
        id.setCodProd(codProd);
    }

    public Double getQuantidade() {
        return estoque;
    }

    public void setQuantidade(Double estoque) {
        this.estoque = estoque;
    }

    public TgfestId getId() {
        return id;
    }

    public void setId(TgfestId id) {
        this.id = id;
    }

    public Double getEstoque() {
        return estoque;
    }

    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }
}
