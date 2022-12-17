package com.example.trabajoFinal.Bean;

import javax.persistence.*;

@Entity
@Table(name = "concesionariofrans")
public class concesionarioFransBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idconcesionariofrans;

    private String nombconcesionariofrans;

    private String distconcesionariofrans;

    private String jefeconcesionariofrans;

    private String tipoconcesionariofrans;


    public Integer getIdconcesionariofrans() {
        return idconcesionariofrans;
    }

    public void setIdconcesionariofrans(Integer idconcesionariofrans) {
        this.idconcesionariofrans = idconcesionariofrans;
    }

    public String getNombconcesionariofrans() {
        return nombconcesionariofrans;
    }

    public void setNombconcesionariofrans(String nombconcesionariofrans) {
        this.nombconcesionariofrans = nombconcesionariofrans;
    }

    public String getDistconcesionariofrans() {
        return distconcesionariofrans;
    }

    public void setDistconcesionariofrans(String distconcesionariofrans) {
        this.distconcesionariofrans = distconcesionariofrans;
    }

    public String getJefeconcesionariofrans() {
        return jefeconcesionariofrans;
    }

    public void setJefeconcesionariofrans(String jefeconcesionariofrans) {
        this.jefeconcesionariofrans = jefeconcesionariofrans;
    }

    public String getTipoconcesionariofrans() {
        return tipoconcesionariofrans;
    }

    public void setTipoconcesionariofrans(String tipoconcesionariofrans) {
        this.tipoconcesionariofrans = tipoconcesionariofrans;
    }
}
