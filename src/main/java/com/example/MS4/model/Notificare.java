package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class Notificare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idIstanzaProcesso;
    @ManyToOne
    @JoinColumn(name="idTipoCD", referencedColumnName = "id")
    private TipoCD idTipoCD;
    @ManyToOne
    @JoinColumn(name="idFrequenzaCD", referencedColumnName = "id")
    private FrequenzaCD idFrequenzaCD;
    @ManyToOne
    @JoinColumn(name = "idStato", referencedColumnName = "id")
    private Stato idStato;
    @ManyToOne
    @JoinColumn(name = "idStatoNotifica", referencedColumnName = "id")
    private StatoNotifica idStatoNotifica;

    public Notificare(Long id, String idIstanzaProcesso, TipoCD idTipoCD, FrequenzaCD idFrequenzaCD, Stato idStato, StatoNotifica idStatoNotifica) {
        this.id = id;
        this.idIstanzaProcesso = idIstanzaProcesso;
        this.idTipoCD = idTipoCD;
        this.idFrequenzaCD = idFrequenzaCD;
        this.idStato = idStato;
        this.idStatoNotifica = idStatoNotifica;
    }

    public Notificare() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdIstanzaProcesso() {
        return idIstanzaProcesso;
    }

    public void setIdIstanzaProcesso(String idIstanzaProcesso) {
        this.idIstanzaProcesso = idIstanzaProcesso;
    }

    public TipoCD getIdTipoCD() {
        return idTipoCD;
    }

    public void setIdTipoCD(TipoCD idTipoCD) {
        this.idTipoCD = idTipoCD;
    }

    public FrequenzaCD getIdFrequenzaCD() {
        return idFrequenzaCD;
    }

    public void setIdFrequenzaCD(FrequenzaCD idFrequenzaCD) {
        this.idFrequenzaCD = idFrequenzaCD;
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
}
