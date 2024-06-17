package com.example.MS4.dto;

import com.example.MS4.model.Destinatario;
import com.example.MS4.model.Gruppo;

import javax.persistence.*;

public class DestinatarioDTO {

    private String indirizzoEmail;
    private Long idGruppo;
    private Boolean flagCC;

    public DestinatarioDTO(Destinatario destinatario) {
        this.indirizzoEmail = destinatario.getIndirizzoEmail();
        this.idGruppo = destinatario.getIdGruppo().getId();
        this.flagCC = destinatario.getFlagCC();
    }
    public DestinatarioDTO() {}

    public String getIndirizzoEmail() {
        return indirizzoEmail;
    }

    public void setIndirizzoEmail(String indirizzoEmail) {
        this.indirizzoEmail = indirizzoEmail;
    }

    public Long getIdGruppo() {
        return idGruppo;
    }

    public void setIdGruppo(Long idGruppo) {
        this.idGruppo = idGruppo;
    }

    public Boolean getFlagCC() {
        return flagCC;
    }

    public void setFlagCC(Boolean flagCC) {
        this.flagCC = flagCC;
    }
}
