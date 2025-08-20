package br.com.codgestao.api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TgfestId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "codprod")
    private Long codProd;

    @Column(name = "codemp")
    private Long codEmp;

    @Column(name = "codlocal")
    private Long codLocal;

    // equals & hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TgfestId)) return false;
        TgfestId that = (TgfestId) o;
        return Objects.equals(codProd, that.codProd) &&
               Objects.equals(codEmp, that.codEmp) &&
               Objects.equals(codLocal, that.codLocal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codProd, codEmp, codLocal);
    }

    // Getters e Setters
    public Long getCodProd() {
        return codProd;
    }

    public void setCodProd(Long codProd) {
        this.codProd = codProd;
    }

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
}
