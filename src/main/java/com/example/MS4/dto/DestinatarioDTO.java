package com.example.MS4.dto;

import com.example.MS4.model.Destinatario;
public class DestinatarioDTO {
    private Long idDestinatario;
    private String email;
    private Boolean flagCc;
    private Long idGruppo;
    public DestinatarioDTO (Destinatario destinatario){
        this.idDestinatario = destinatario.getIdDestinatario();
        this.email = destinatario.getEmail();
        this.flagCc = destinatario.getFlagCc();
        this.idGruppo = destinatario.getIdGruppo().getIdGruppo();
    }
    public Long getIdDestinatario() {return idDestinatario;}
    public String getEmail() {return email;}
    public Boolean getFlagCc() {return flagCc;}
    public Long getIdGruppo() {return idGruppo;}
    public void setIdDestinatario(Long idDestinatario) {
        this.idDestinatario = idDestinatario;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFlagCc(Boolean flagCc) {
        this.flagCc = flagCc;
    }
    public void setIdGruppo(Long idGruppo) {
        this.idGruppo = idGruppo;
    }
    @Override
    public String toString() {
        return "Destinatario{" +
                "idDestinatario=" + idDestinatario +
                ", email='" + email + '\'' +
                ", flagCc=" + flagCc +
                ", idGruppo=" + idGruppo +
                '}';
    }
}
