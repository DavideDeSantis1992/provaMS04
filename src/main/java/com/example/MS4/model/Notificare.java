package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class Notificare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNotifica;
    private String idIstanzaProcesso;
    @ManyToOne
    @JoinColumn(name="idTipo")
    private Tipo idTipo;
    @ManyToOne
    @JoinColumn(name="idFrequenza")
    private Frequenza idFrequenza;
    @ManyToOne
    @JoinColumn(name="idStato")
    private Stato idStato;
    @ManyToOne
    @JoinColumn(name="idStatoNotifica")
    private StatoNotifica idStatoNotifica;
    public Notificare(Long idNotifica, String idIstanzaProcesso, Tipo idTipo, Frequenza idFrequenza, Stato idStato, StatoNotifica idStatoNotifica) {
        this.idNotifica = idNotifica;
        this.idIstanzaProcesso = idIstanzaProcesso;
        this.idTipo = idTipo;
        this.idFrequenza = idFrequenza;
        this.idStato = idStato;
        this.idStatoNotifica = idStatoNotifica;
    }

    public Notificare() {
    }

    public Long getIdNotifica() {
        return idNotifica;
    }

    public void setIdNotifica(Long idNotifica) {
        this.idNotifica = idNotifica;
    }

    public String getIdIstanzaProcesso() {
        return idIstanzaProcesso;
    }

    public void setIdIstanzaProcesso(String idIstanzaProcesso) {
        this.idIstanzaProcesso = idIstanzaProcesso;
    }

    public Tipo getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Tipo idTipo) {
        this.idTipo = idTipo;
    }

    public Frequenza getIdFrequenza() {
        return idFrequenza;
    }

    public void setIdFrequenza(Frequenza idFrequenza) {
        this.idFrequenza = idFrequenza;
    }

    public Stato getIdStato() {
        return idStato;
    }

    public void setIdStato(Stato idStato) {
        this.idStato = idStato;
    }

    public StatoNotifica getIdStatoNotifica() {
        return idStatoNotifica;
    }

    public void setIdStatoNotifica(StatoNotifica idStatoNotifica) {
        this.idStatoNotifica = idStatoNotifica;
    }

    @Override
    public String toString() {
        return "Notificare{" +
                "idNotifica=" + idNotifica +
                ", idIstanzaProcesso='" + idIstanzaProcesso + '\'' +
                ", idTipo=" + idTipo +
                ", idFrequenza=" + idFrequenza +
                ", idStato=" + idStato +
                ", idStatoNotifica=" + idStatoNotifica +
                '}';
    }
}
