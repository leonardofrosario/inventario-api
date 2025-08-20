package br.com.codgestao.api.model;

import javax.persistence.*;

@Entity
@Table(name = "tsiusu")
public class Usuario {

    @Id
    @Column(name = "codusu")
    private Long codUsu;

    @Column(name = "nomeusu", nullable = false, unique = true)
    private String nomeUsu;

    @Column(name = "interno", nullable = false)
    private String interno;

 
    public Long getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(Long codUsu) {
        this.codUsu = codUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getInterno() {
        return interno;
    }

    public void setInterno(String interno) {
        this.interno = interno;
    }
}
