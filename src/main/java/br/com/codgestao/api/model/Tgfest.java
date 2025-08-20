package br.com.codgestao.api.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "Tgfest")
@Table(name = "tgfest")
public class Tgfest {
    @EmbeddedId
    private TgfestId id;

    @Column(name = "estoque")
    private BigDecimal estoque;

    @Column(name = "reservado")
    private BigDecimal reservado;

    @Column(name = "controle")
    private String controle;

    @Column(name = "dtfabricacao")
    private LocalDate dtFabricacao;

    @Column(name = "dtval")
    private LocalDate dtVal;

	
    
    public TgfestId getId() {
		return id;
	}

	public void setId(TgfestId id) {
		this.id = id;
	}

	public BigDecimal getEstoque() {
		return estoque;
	}

	public void setEstoque(BigDecimal estoque) {
		this.estoque = estoque;
	}

	public BigDecimal getReservado() {
		return reservado;
	}

	public void setReservado(BigDecimal reservado) {
		this.reservado = reservado;
	}

	public String getControle() {
		return controle;
	}

	public void setControle(String controle) {
		this.controle = controle;
	}

	public LocalDate getDtFabricacao() {
		return dtFabricacao;
	}

	public void setDtFabricacao(LocalDate dtFabricacao) {
		this.dtFabricacao = dtFabricacao;
	}

	public LocalDate getDtVal() {
		return dtVal;
	}

	public void setDtVal(LocalDate dtVal) {
		this.dtVal = dtVal;
	}

}
