package com.example.MS4.model;


import javax.persistence.*;

@Entity
@Table
public class FrequenzaCD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descrizione;

    public FrequenzaCD(Long id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }

    public FrequenzaCD() {
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
