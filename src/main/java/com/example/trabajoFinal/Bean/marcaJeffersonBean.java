package com.example.trabajoFinal.Bean;

import javax.persistence.*;

@Entity
@Table(name = "marcajefferson")
public class marcaJeffersonBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmarca;

    private String codmarca;

    private String nombmarca;

    private String paismarca;

    private Boolean estado;

    public Integer getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(Integer idmarca) {
        this.idmarca = idmarca;
    }

    public String getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(String codmarca) {
        this.codmarca = codmarca;
    }

    public String getNombmarca() {
        return nombmarca;
    }

    public void setNombmarca(String nombmarca) {
        this.nombmarca = nombmarca;
    }

    public String getPaismarca() {
        return paismarca;
    }

    public void setPaismarca(String paismarca) {
        this.paismarca = paismarca;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
