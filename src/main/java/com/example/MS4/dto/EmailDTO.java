package com.example.MS4.dto;

import com.example.MS4.model.Email;

public class EmailDTO {
    private Long idEmail;
    private String bodyEmail;
    private Long idGruppo;

    public EmailDTO(Email email){
        this.idEmail = email.getIdEmail();
        this.bodyEmail = email.getBodyEmail();
        this.idGruppo = email.getIdGruppo().getIdGruppo();
    }

    public Long getIdEmail() {
        return idEmail;
    }
    public String getBodyEmail() {
        return bodyEmail;
    }
    public Long getIdGruppo() {
        return idGruppo;
    }

    public void setIdEmail(Long idEmail) {
        this.idEmail = idEmail;
    }
    public void setBodyEmail(String bodyEmail) {
        this.bodyEmail = bodyEmail;
    }
    public void setIdGruppo(Long idGruppo) {
        this.idGruppo = idGruppo;
    }

    @Override
    public String toString() {
        return "EmailCorpo{" +
                "idEmail=" + idEmail +
                ", bodyEmail='" + bodyEmail + '\'' +
                ", idGruppoNotifica=" + idGruppo +
                '}';
    }
}
