package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class StatoNotifica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStatoNotifica;
    private String descrizione;

    public Long getIdStatoNotifica() {
        return idStatoNotifica;
    }

    public void setIdStatoNotifica(Long idStatoNotifica) {
        this.idStatoNotifica = idStatoNotifica;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public StatoNotifica(Long idStatoNotifica, String descrizione) {
        this.idStatoNotifica = idStatoNotifica;
        this.descrizione = descrizione;
    }

    public StatoNotifica(){}

    @Override
    public String toString() {
        return "StatoNotifica{" +
                "idStatoNotifica=" + idStatoNotifica +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
