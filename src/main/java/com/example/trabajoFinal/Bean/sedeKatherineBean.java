package com.example.trabajoFinal.Bean;
import javax.persistence.*;

@Entity
@Table(name = "sedekatherine")
public class sedeKatherineBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsedekatherine;

    private String nombsedekatherine;

    private String distsedekatherine;

    private String tiposedekatherine;

    private Boolean estado;

    public Integer getIdsedekatherine() {
        return idsedekatherine;
    }

    public void setIdsedekatherine(Integer idsedekatherine) {
        this.idsedekatherine = idsedekatherine;
    }

    public String getNombsedekatherine() {
        return nombsedekatherine;
    }

    public void setNombsedekatherine(String nombsedekatherine) {
        this.nombsedekatherine = nombsedekatherine;
    }

    public String getDistsedekatherine() {
        return distsedekatherine;
    }

    public void setDistsedekatherine(String distsedekatherine) {
        this.distsedekatherine = distsedekatherine;
    }

    public String getTiposedekatherine() {
        return tiposedekatherine;
    }

    public void setTiposedekatherine(String tiposedekatherine) {
        this.tiposedekatherine = tiposedekatherine;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
