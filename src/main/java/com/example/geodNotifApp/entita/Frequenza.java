package com.example.geodNotifApp.entita;

public class Frequenza {

    private String id;
    private String descrizione;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Frequenza(String id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }

    public Frequenza() {
    }
}
