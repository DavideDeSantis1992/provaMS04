package com.example.MS4.dto;

import com.example.MS4.model.EsitoOperazione;

public class IstanzaRicercaResponse {
    private EsitoOperazione esitoOperazione;
    private String idIstanzaProcesso;

    private Boolean trovata;

    public IstanzaRicercaResponse(EsitoOperazione esitoOperazione,
                                  String idIstanzaProcesso,
                                  Boolean trovata) {
        this.esitoOperazione = esitoOperazione;
        this.idIstanzaProcesso = idIstanzaProcesso;
        this.trovata = trovata;
    }

    public EsitoOperazione getEsitoOperazione() {
        return esitoOperazione;
    }

    public void setEsitoOperazione(EsitoOperazione esitoOperazione) {
        this.esitoOperazione = esitoOperazione;
    }

    public String getIdIstanzaProcesso() {
        return idIstanzaProcesso;
    }
    public void setIdIstanzaProcesso(String idIstanzaProcesso) {
        this.idIstanzaProcesso = idIstanzaProcesso;
    }

    public Boolean getTrovata() {
        return trovata;
    }
    public void setTrovata(Boolean trovata) {
        this.trovata = trovata;
    }

    @Override
    public String toString() {
        return "IstanzaRicercaResponse [" +
                "esitoOperazione=" + esitoOperazione +
                ", idIstanzaProcesso=" + idIstanzaProcesso +
                ", trovata=" + trovata +
                "]";
    }

}
