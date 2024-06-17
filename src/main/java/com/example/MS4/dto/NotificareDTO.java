package com.example.MS4.dto;

import com.example.MS4.model.Notificare;

public class NotificareDTO {

    private Long idNotifica;
    private String idIstanzaProcesso;
    private Long idTipo;
    private Long idFrequenza;
    private Long idStato;
    private Long idStatoNotifica;

    public NotificareDTO (Notificare notificare) {
        // this.idNotifica = notificare.getIdNotifica();
        this.idIstanzaProcesso = notificare.getIdIstanzaProcesso();
        this.idTipo = notificare.getIdTipo().getIdTipo();
        this.idFrequenza = notificare.getIdFrequenza().getIdFrequenza();
        this.idStato = notificare.getIdStato().getIdStato();
        this.idStatoNotifica = notificare.getIdStatoNotifica().getIdStatoNotifica();
    }

    public Long getIdNotifica() {
        return idNotifica;
    }
    public String getIdIstanzaProcesso() {
        return idIstanzaProcesso;
    }
    public Long getIdTipo() {
        return idTipo;
    }
    public Long getIdFrequenza() {
        return idFrequenza;
    }
    public Long getIdStato() {
        return idStato;
    }
    public Long getIdStatoNotifica() {
        return idStatoNotifica;
    }

    public void setIdNotifica(Long idNotifica) {
        this.idNotifica = idNotifica;
    }
    public void setIdIstanzaProcesso(String idIstanzaProcesso) {
        this.idIstanzaProcesso = idIstanzaProcesso;
    }
    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }
    public void setIdFrequenza(Long idFrequenza) {
        this.idFrequenza = idFrequenza;
    }
    public void setIdStato(Long idStato) {
        this.idStato = idStato;
    }
    public void setIdStatoNotifica(Long idStatoNotifica) {
        this.idStatoNotifica = idStatoNotifica;
    }

    //toString
    @Override
    public String toString() {
        return "NotificareDTO [idNotifica=" + idNotifica + ", idIstanzaProcesso=" + idIstanzaProcesso
                + ", idTipo=" + idTipo + ", idFrequenza=" + idFrequenza + ", idStato=" + idStato
                + ", idStatoNotifica=" + idStatoNotifica + "]";
    }
}
