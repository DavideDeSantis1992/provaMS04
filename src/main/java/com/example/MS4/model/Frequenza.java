package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class Frequenza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFrequenza;
    private String descrizione;


    public Frequenza(Long idFrequenza, String descrizione) {
        this.idFrequenza = idFrequenza;
        this.descrizione = descrizione;
    }

    public Frequenza(){}

    public Long getIdFrequenza() {
        return idFrequenza;
    }


    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Frequenza{" +
                "idFrequenza=" + idFrequenza +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
