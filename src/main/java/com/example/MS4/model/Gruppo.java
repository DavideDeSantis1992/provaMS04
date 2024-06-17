package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class Gruppo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descrizione;

    public Gruppo(Long id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }

    public Gruppo() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
