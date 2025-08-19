package br.com.codgestao.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tgfcte {

    @EmbeddedId
    private TgfcteId id;

    @Column(name = "QTDEST")
    private Double qtdEst;

    @Column(name = "DTVAL")
    @Temporal(TemporalType.DATE)
    private Date dtVal;

    @Column(name = "NOMEARQBOMI")
    private String nomeArqBomi;

    @Column(name = "DHCONFBOMI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dhConfBomi;

    @Column(name = "ERROCONFBOMI")
    private String erroConfBomi;

    @Column(name = "QTDESTUNCAD")
    private Double qtdEstUnCad;

    @Column(name = "NUIVT")
    private Long nuIvt;

    @Column(name = "PESAGEM")
    private Double pesagem;

    @Column(name = "DTFABRICACAO")
    @Temporal(TemporalType.DATE)
    private Date dtFabricacao;

    // 🔹 Getters e setters
    public TgfcteId getId() {
        return id;
    }

    public void setId(TgfcteId id) {
        this.id = id;
    }

    public Double getQtdEst() {
        return qtdEst;
    }

    public void setQtdEst(Double qtdEst) {
        this.qtdEst = qtdEst;
    }

    public Date getDtVal() {
        return dtVal;
    }

    public void setDtVal(Date dtVal) {
        this.dtVal = dtVal;
    }

    public String getNomeArqBomi() {
        return nomeArqBomi;
    }

    public void setNomeArqBomi(String nomeArqBomi) {
        this.nomeArqBomi = nomeArqBomi;
    }

    public Date getDhConfBomi() {
        return dhConfBomi;
    }

    public void setDhConfBomi(Date dhConfBomi) {
        this.dhConfBomi = dhConfBomi;
    }

    public String getErroConfBomi() {
        return erroConfBomi;
    }

    public void setErroConfBomi(String erroConfBomi) {
        this.erroConfBomi = erroConfBomi;
    }

    public Double getQtdEstUnCad() {
        return qtdEstUnCad;
    }

    public void setQtdEstUnCad(Double qtdEstUnCad) {
        this.qtdEstUnCad = qtdEstUnCad;
    }

    public Long getNuIvt() {
        return nuIvt;
    }

    public void setNuIvt(Long nuIvt) {
        this.nuIvt = nuIvt;
    }

    public Double getPesagem() {
        return pesagem;
    }

    public void setPesagem(Double pesagem) {
        this.pesagem = pesagem;
    }

    public Date getDtFabricacao() {
        return dtFabricacao;
    }

    public void setDtFabricacao(Date dtFabricacao) {
        this.dtFabricacao = dtFabricacao;
    }
}
