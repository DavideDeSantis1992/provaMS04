package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class Stato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStato;
    private String descrizione;


    public Stato(Long idStato, String descrizione) {
        this.idStato = idStato;
        this.descrizione = descrizione;
    }

    public Stato() {}

    public Long getIdStato() {
        return idStato;
    }

    public void setIdStato(Long idStato) {
        this.idStato = idStato;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    @Override
    public String toString() {
        return "Stato{" +
                "idStato=" + idStato +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
