package com.example.MS4.model;

import javax.persistence.*;

@Table
@Entity
public class StatoNotifica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descrizione;

    public StatoNotifica(Long id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }

    public StatoNotifica() {
    }

    public Long getId() {
        return id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


}
