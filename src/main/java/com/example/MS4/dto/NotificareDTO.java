package com.example.MS4.dto;

import com.example.MS4.model.Notificare;
import org.aspectj.weaver.ast.Not;

import javax.persistence.*;

public class NotificareDTO {
    private String idIstanzaProcesso;
    private Long idTipoCD;
    private Long idFrequenzaCD;
    private Long idStato;
    private Long idStatoNotifica;

    public NotificareDTO() {}

    public NotificareDTO(Notificare notificare){
        this.idIstanzaProcesso = notificare.getIdIstanzaProcesso();
        this.idTipoCD = notificare.getIdTipoCD().getId();
        this.idFrequenzaCD = notificare.getIdFrequenzaCD().getId();
        this.idStato = notificare.getIdStato().getId();
        this.idStatoNotifica = notificare.getIdStatoNotifica().getId();
    }

    public String getIdIstanzaProcesso() {
        return idIstanzaProcesso;
    }

    public void setIdIstanzaProcesso(String idIstanzaProcesso) {
        this.idIstanzaProcesso = idIstanzaProcesso;
    }

    public Long getIdTipoCD() {
        return idTipoCD;
    }

    public void setIdTipoCD(Long idTipoCD) {
        this.idTipoCD = idTipoCD;
    }

    public Long getIdFrequenzaCD() {
        return idFrequenzaCD;
    }

    public void setIdFrequenzaCD(Long idFrequenzaCD) {
        this.idFrequenzaCD = idFrequenzaCD;
    }

    public Long getIdStato() {
        return idStato;
    }

    public void setIdStato(Long idStato) {
        this.idStato = idStato;
    }

    public Long getIdStatoNotifica() {
        return idStatoNotifica;
    }

    public void setIdStatoNotifica(Long idStatoNotifica) {
        this.idStatoNotifica = idStatoNotifica;
    }
}
