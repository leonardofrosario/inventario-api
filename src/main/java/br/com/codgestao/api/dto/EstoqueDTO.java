package br.com.codgestao.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EstoqueDTO {
    private Long codProd;
    private String descrProd;
    private String codVol;
    private String referencia;
    private String refForn;
    private String localizacao;
    private Long codEmp;
    private String razaoSocial;
    private Long codLocal;
    private BigDecimal estoque;
    private BigDecimal reservado;
    private String controle;
    private LocalDate dtFabricacao;
    private LocalDate dtVal;

    // 🔹 Construtor usado pelo JPQL
    public EstoqueDTO(Long codProd, String descrProd, String codVol, String referencia, String refForn,
                      String localizacao, Long codEmp, String razaoSocial, Long codLocal, BigDecimal estoque,
                      BigDecimal reservado, String controle, LocalDate dtFabricacao, LocalDate dtVal) {
        this.codProd = codProd;
        this.descrProd = descrProd;
        this.codVol = codVol;
        this.referencia = referencia;
        this.refForn = refForn;
        this.localizacao = localizacao;
        this.codEmp = codEmp;
        this.razaoSocial = razaoSocial;
        this.codLocal = codLocal;
        this.estoque = estoque;
        this.reservado = reservado;
        this.controle = controle;
        this.dtFabricacao = dtFabricacao;
        this.dtVal = dtVal;
    }


    // Getters e Setters
    public Long getCodProd() { return codProd; }
    public void setCodProd(Long codProd) { this.codProd = codProd; }

    public String getDescrProd() { return descrProd; }
    public void setDescrProd(String descrProd) { this.descrProd = descrProd; }

    public String getCodVol() { return codVol; }
    public void setCodVol(String codVol) { this.codVol = codVol; }

    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }

    public String getRefForn() { return refForn; }
    public void setRefForn(String refForn) { this.refForn = refForn; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public Long getCodEmp() { return codEmp; }
    public void setCodEmp(Long codEmp) { this.codEmp = codEmp; }

    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }

    public Long getCodLocal() { return codLocal; }
    public void setCodLocal(Long codLocal) { this.codLocal = codLocal; }

    public BigDecimal getEstoque() { return estoque; }
    public void setEstoque(BigDecimal estoque) { this.estoque = estoque; }

    public BigDecimal getReservado() { return reservado; }
    public void setReservado(BigDecimal reservado) { this.reservado = reservado; }

    public String getControle() { return controle; }
    public void setControle(String controle) { this.controle = controle; }

    public LocalDate getDtFabricacao() { return dtFabricacao; }
    public void setDtFabricacao(LocalDate dtFabricacao) { this.dtFabricacao = dtFabricacao; }

    public LocalDate getDtVal() { return dtVal; }
    public void setDtVal(LocalDate dtVal) { this.dtVal = dtVal; }
}
