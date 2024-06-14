package com.example.MS4.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class DB4Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descrizione;
    private String idProcesso;
    private Date data;
    private String livello;
    private String codiceMs;


    public DB4Log(Long id, String descrizione, String idProcesso, Date data, String livello, String codiceMs) {
        this.id = id;
        this.descrizione = descrizione;
        this.idProcesso = idProcesso;
        this.data = data;
        this.livello = livello;
        this.codiceMs = codiceMs;
    }
    public DB4Log(){}

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

    public String getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(String idProcesso) {
        this.idProcesso = idProcesso;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    public String getCodiceMs() {
        return codiceMs;
    }

    public void setCodiceMs(String codiceMs) {
        this.codiceMs = codiceMs;
    }


    @Override
    public String toString() {
        return "DB4Log{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", idProcesso='" + idProcesso + '\'' +
                ", data=" + data +
                ", livello='" + livello + '\'' +
                ", codiceMs='" + codiceMs + '\'' +
                '}';
    }
}
