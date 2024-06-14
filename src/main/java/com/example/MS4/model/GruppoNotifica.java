package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class GruppoNotifica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGruppoNotifica;
    private String descrizione;

    @Override
    public String toString() {
        return "GruppoNotifica{" +
                "idGruppoNotifica=" + idGruppoNotifica +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }

    public GruppoNotifica(Long idGruppoNotifica, String descrizione) {
        this.idGruppoNotifica = idGruppoNotifica;
        this.descrizione = descrizione;
    }
    public GruppoNotifica(){}


    public Long getIdGruppoNotifica() {
        return idGruppoNotifica;
    }

    public void setIdGruppoNotifica(Long idGruppoNotifica) {
        this.idGruppoNotifica = idGruppoNotifica;
    }


    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

}
