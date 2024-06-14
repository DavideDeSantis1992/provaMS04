package com.example.MS4.dto;

public class IstanzaRicercaRequest {
    private String idIstanzaProcesso;

    public String getIdIstanzaProcesso() {
        return idIstanzaProcesso;
    }
    public void setIdIstanzaProcesso(String idIstanzaProcesso) {
        this.idIstanzaProcesso = idIstanzaProcesso;
    }

    public IstanzaRicercaRequest(String idIstanzaProcesso) {
        this.idIstanzaProcesso = idIstanzaProcesso;
    }

    public IstanzaRicercaRequest() {
    }

    @Override
    public String toString() {
        return "IstanzaRicercaRequest [idIstanzaProcesso=" + idIstanzaProcesso + "]";
    }
}
