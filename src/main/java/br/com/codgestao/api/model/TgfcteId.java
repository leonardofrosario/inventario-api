package br.com.codgestao.api.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class TgfcteId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Temporal(TemporalType.DATE)
    @Column(name = "DTCONTAGEM")
    private Date dtContagem;

    @Column(name = "CODEMP")
    private Long codEmp;

    @Column(name = "CODLOCAL")
    private Long codLocal;

    @Column(name = "CODPROD")
    private Long codProd;

    @Column(name = "CONTROLE")
    private String controle;

    @Column(name = "CODVOL")
    private String codVol;

    @Column(name = "CODPARC")
    private Long codParc;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "SEQUENCIA")
    private Long sequencia;

    // 🔹 equals e hashCode obrigatórios em IDs compostos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TgfcteId)) return false;
        TgfcteId that = (TgfcteId) o;
        return Objects.equals(dtContagem, that.dtContagem) &&
               Objects.equals(codEmp, that.codEmp) &&
               Objects.equals(codLocal, that.codLocal) &&
               Objects.equals(codProd, that.codProd) &&
               Objects.equals(controle, that.controle) &&
               Objects.equals(codVol, that.codVol) &&
               Objects.equals(codParc, that.codParc) &&
               Objects.equals(tipo, that.tipo) &&
               Objects.equals(sequencia, that.sequencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dtContagem, codEmp, codLocal, codProd, controle, codVol, codParc, tipo, sequencia);
    }
}
