package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class Gruppo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGruppo;
    private String descrizione;

    @Override
    public String toString() {
        return "GruppoNotifica{" +
                "idGruppoNotifica=" + idGruppo +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }

    public Gruppo(Long idGruppo, String descrizione) {
        this.idGruppo= idGruppo;
        this.descrizione = descrizione;
    }
    public Gruppo(){}


    public Long getIdGruppo() {
        return idGruppo;
    }

    public void setIdGruppo(Long idGruppo) {
        this.idGruppo = idGruppo;
    }


    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

}
