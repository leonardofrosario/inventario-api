package br.com.codgestao.api.model;

import javax.persistence.*;

@Entity(name = "Tsiemp")
@Table(name = "tsiemp")
public class Tsiemp {
    @Id
    @Column(name = "codemp")
    private Long codEmp;

    @Column(name = "razaosocial")
    private String razaoSocial;

	public Long getCodEmp() {
		return codEmp;
	}

	public void setCodEmp(Long codEmp) {
		this.codEmp = codEmp;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

    
}
