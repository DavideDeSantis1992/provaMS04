package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class DestinatarioMail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDestinatario;
    private String email;
    private Boolean flagCc;
    @ManyToOne
    @JoinColumn(name = "idGruppoNotifica")
    private GruppoNotifica idGruppoNotifica;

    public DestinatarioMail(Long idDestinatario, String email, Boolean flagCc, GruppoNotifica idGruppoNotifica) {
        this.idDestinatario = idDestinatario;
        this.email = email;
        this.flagCc = flagCc;
        this.idGruppoNotifica = idGruppoNotifica;
    }



    public DestinatarioMail(){}
    public Long getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(Long idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getFlagCc() {
        return flagCc;
    }

    public void setFlagCc(Boolean flagCc) {
        this.flagCc = flagCc;
    }

    public GruppoNotifica getIdGruppoNotifica() {
        return idGruppoNotifica;
    }

    public void setIdGruppoNotifica(GruppoNotifica idGruppoNotifica) {
        this.idGruppoNotifica = idGruppoNotifica;
    }

    @Override
    public String toString() {
        return "DestinatarioMail{" +
                "idDestinatario=" + idDestinatario +
                ", email='" + email + '\'' +
                ", flagCc=" + flagCc +
                ", idGruppoNotifica=" + idGruppoNotifica +
                '}';
    }

}
