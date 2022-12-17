package com.example.trabajoFinal.Bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "modelonoemi")
public class modeloNoemiBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmodelonoemi;

    private String marcamodelonoemi;

    private String nombmodelonoemi;

    private Integer cantmodelonoemi;

    private Date fechamodelonoemi;

    private Boolean estado;


    public Integer getIdmodelonoemi() {
        return idmodelonoemi;
    }

    public void setIdmodelonoemi(Integer idmodelonoemi) {
        this.idmodelonoemi = idmodelonoemi;
    }

    public String getMarcamodelonoemi() {
        return marcamodelonoemi;
    }

    public void setMarcamodelonoemi(String marcamodelonoemi) {
        this.marcamodelonoemi = marcamodelonoemi;
    }

    public String getNombmodelonoemi() {
        return nombmodelonoemi;
    }

    public void setNombmodelonoemi(String nombmodelonoemi) {
        this.nombmodelonoemi = nombmodelonoemi;
    }

    public Integer getCantmodelonoemi() {
        return cantmodelonoemi;
    }

    public void setCantmodelonoemi(Integer cantmodelonoemi) {
        this.cantmodelonoemi = cantmodelonoemi;
    }

    public Date getFechamodelonoemi() {
        return fechamodelonoemi;
    }

    public void setFechamodelonoemi(Date fechamodelonoemi) {
        this.fechamodelonoemi = fechamodelonoemi;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
