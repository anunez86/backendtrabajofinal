package com.example.trabajoFinal.Bean;

import javax.persistence.*;

@Entity
@Table(name = "articuloanthony")
public class articuloAnthonyBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idarticuloanthony;

    private String nombarticuloanthony;

    public Integer cantarticuloanthony;

    public Integer prearticuloanthony;

    public String tipoarticuloanthony;

    private Boolean estadoanthony;

    public Integer getIdarticuloanthony() {
        return idarticuloanthony;
    }

    public void setIdarticuloanthony(Integer idarticuloanthony) {
        this.idarticuloanthony = idarticuloanthony;
    }

    public String getNombarticuloanthony() {
        return nombarticuloanthony;
    }

    public void setNombarticuloanthony(String nombarticuloanthony) {
        this.nombarticuloanthony = nombarticuloanthony;
    }

    public Integer getCantarticuloanthony() {
        return cantarticuloanthony;
    }

    public void setCantarticuloanthony(Integer cantarticuloanthony) {
        this.cantarticuloanthony = cantarticuloanthony;
    }

    public Integer getPrearticuloanthony() {
        return prearticuloanthony;
    }

    public void setPrearticuloanthony(Integer prearticuloanthony) {
        this.prearticuloanthony = prearticuloanthony;
    }

    public String getTipoarticuloanthony() {
        return tipoarticuloanthony;
    }

    public void setTipoarticuloanthony(String tipoarticuloanthony) {
        this.tipoarticuloanthony = tipoarticuloanthony;
    }

    public Boolean getEstadoanthony() {
        return estadoanthony;
    }

    public void setEstadoanthony(Boolean estadoanthony) {
        this.estadoanthony = estadoanthony;
    }
}





