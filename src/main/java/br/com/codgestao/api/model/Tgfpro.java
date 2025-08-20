package br.com.codgestao.api.model;

import javax.persistence.*;

@Entity(name = "Tgfpro")
@Table(name = "tgfpro")
public class Tgfpro {
    @Id
    @Column(name = "codprod")
    private Long codProd;

    @Column(name = "descrprod")
    private String descrProd;

    @Column(name = "codvol")
    private String codVol;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "refforn")
    private String refForn;

    @Column(name = "localizacao")
    private String localizacao;

	public Long getCodProd() {
		return codProd;
	}

	public void setCodProd(Long codProd) {
		this.codProd = codProd;
	}

	public String getDescrProd() {
		return descrProd;
	}

	public void setDescrProd(String descrProd) {
		this.descrProd = descrProd;
	}

	public String getCodVol() {
		return codVol;
	}

	public void setCodVol(String codVol) {
		this.codVol = codVol;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getRefForn() {
		return refForn;
	}

	public void setRefForn(String refForn) {
		this.refForn = refForn;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

   
}
