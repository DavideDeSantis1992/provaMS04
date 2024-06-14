package com.example.MS4.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class EsitoOperazione {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codice;
    private String descrizione;
    private String messaggi;
    private String idIstanzaProcesso;

    public EsitoOperazione(Long id, String codice, String descrizione, String messaggi, String idIstanzaProcesso) {
        this.id = id;
        this.codice = codice;
        this.descrizione = descrizione;
        this.messaggi = messaggi;
        this.idIstanzaProcesso = idIstanzaProcesso;
    }
    public EsitoOperazione(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getMessaggi() {
        return messaggi;
    }

    public void setMessaggi(String messaggi) {
        this.messaggi = messaggi;
    }

    public String getIdIstanzaProcesso() {
        return idIstanzaProcesso;
    }

    public void setIdIstanzaProcesso(String idIstanzaProcesso) {
        this.idIstanzaProcesso = idIstanzaProcesso;
    }

    @Override
    public String toString() {
        return "EsitoOperazione{" +
                "id=" + id +
                ", codice='" + codice + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", messaggi=" + messaggi +
                ", idIstanzaProcesso='" + idIstanzaProcesso + '\'' +
                '}';
    }
}
