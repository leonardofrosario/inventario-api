package br.com.codgestao.api.model;

import javax.persistence.*;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TGFEST", schema = "BRNTST")
public class Tgfest {

    @EmbeddedId
    private TgfestId id;

    @Column(name = "ESTOQUE", columnDefinition = "FLOAT")
    private Double estoque;

    // 🔹 Getters compatíveis com o service
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

    // 🔹 Getters e setters diretos para compatibilidade
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
