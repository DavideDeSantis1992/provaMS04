package com.example.MS4.model;

import javax.persistence.*;



public class ChiamataPostman {

    private String idIstanzaProcesso;
    private String stato;
    private String tipo;
    private String frequenza;


    public ChiamataPostman(String idIstanzaProcesso, String stato, String tipo, String frequenza) {

        this.idIstanzaProcesso = idIstanzaProcesso;
        this.stato = stato;
        this.tipo = tipo;
        this.frequenza = frequenza;
    }

    public ChiamataPostman() {}



    public String getIdIstanzaProcesso() {
        return idIstanzaProcesso;
    }

    public void setIdIstanzaProcesso(String idIstanzaProcesso) {
        this.idIstanzaProcesso = idIstanzaProcesso;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFrequenza() {
        return frequenza;
    }

    public void setFrequenza(String frequenza) {
        this.frequenza = frequenza;
    }

    @Override
    public String toString() {
        return "ProvaChiamata{" +
                "stato='" + stato + '\'' +
                ", tipo='" + tipo + '\'' +
                ", frequenza='" + frequenza + '\'' +
                '}';
    }
}
