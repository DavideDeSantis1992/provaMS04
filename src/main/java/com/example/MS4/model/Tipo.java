package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class Tipo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idTipo;
    private String descrizione;


    public Tipo(Long idTipo, String descrizione) {
        this.idTipo = idTipo;
        this.descrizione = descrizione;
    }
    public Tipo(){}

    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }


    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "idTipo=" + idTipo +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
