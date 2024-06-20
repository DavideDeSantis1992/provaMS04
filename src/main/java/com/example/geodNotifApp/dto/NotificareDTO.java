package com.example.geodNotifApp.dto;

import com.example.geodNotifApp.entita.Frequenza;
import com.example.geodNotifApp.entita.StatoArtifact;
import com.example.geodNotifApp.entita.StatoNotifica;
import com.example.geodNotifApp.entita.Tipo;

public class NotificareDTO {
    private String idIstanzaProcesso;
    private Tipo idTipoCd;
    private Frequenza idFrequenzaCd;;
    private StatoArtifact idStatoArtifact;
    private StatoNotifica idStatoNotifica;


    public String getIdIstanzaProcesso() {
        return idIstanzaProcesso;
    }
    public void setIdIstanzaProcesso(String idIstanzaProcesso) {
        this.idIstanzaProcesso = idIstanzaProcesso;
    }
    public Tipo getIdTipoCd() {
        return idTipoCd;
    }
    public void setIdTipoCd(Tipo idTipoCd) {
        this.idTipoCd = idTipoCd;
    }
    public Frequenza getIdFrequenzaCd() {
        return idFrequenzaCd;
    }
    public void setIdFrequenzaCd(Frequenza idFrequenzaCd) {
        this.idFrequenzaCd = idFrequenzaCd;
    }
    public StatoArtifact getIdStatoArtifact() {
        return idStatoArtifact;
    }
    public void setIdStatoArtifact(StatoArtifact idStatoArtifact) {
        this.idStatoArtifact = idStatoArtifact;
    }
    public StatoNotifica getIdStatoNotifica() {
        return idStatoNotifica;
    }
    public void setIdStatoNotifica(StatoNotifica idStatoNotifica) {
        this.idStatoNotifica = idStatoNotifica;
    }


}
