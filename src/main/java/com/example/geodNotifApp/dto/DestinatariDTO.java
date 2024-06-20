package com.example.geodNotifApp.dto;

public class DestinatariDTO {
    private String email;
    private String flagCc;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFlagCc() {
        return flagCc;
    }
    public void setFlagCc(String flagCc) {
        this.flagCc = flagCc;
    }

    public DestinatariDTO(String email, String flagCc) {
        this.email = email;
        this.flagCc = flagCc;
    }

    public DestinatariDTO() {
    }
}
