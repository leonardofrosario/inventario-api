package br.com.codgestao.api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TgfestId implements Serializable {

    private static final long serialVersionUID = 1L; // 🔹 adicionado

    @Column(name = "CODEMP")
    private Long codEmp;

    @Column(name = "CODLOCAL")
    private Long codLocal;

    @Column(name = "CODPROD")
    private Long codProd;

    @Column(name = "CONTROLE")
    private String controle;

    public Long getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(Long codEmp) {
        this.codEmp = codEmp;
    }

    public Long getCodLocal() {
        return codLocal;
    }

    public void setCodLocal(Long codLocal) {
        this.codLocal = codLocal;
    }

    public Long getCodProd() {
        return codProd;
    }

    public void setCodProd(Long codProd) {
        this.codProd = codProd;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    // 🔹 Equals e hashCode obrigatórios
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TgfestId)) return false;
        TgfestId that = (TgfestId) o;
        return Objects.equals(codEmp, that.codEmp) &&
               Objects.equals(codLocal, that.codLocal) &&
               Objects.equals(codProd, that.codProd) &&
               Objects.equals(controle, that.controle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEmp, codLocal, codProd, controle);
    }
}
