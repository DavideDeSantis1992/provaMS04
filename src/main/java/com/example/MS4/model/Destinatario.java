package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class Destinatario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDestinatario;
    private String email;
    private Boolean flagCc;
    @ManyToOne
    @JoinColumn(name = "idGruppo")
    private Gruppo idGruppo;

    public Destinatario(Long idDestinatario, String email, Boolean flagCc, Gruppo idGruppo) {
        this.idDestinatario = idDestinatario;
        this.email = email;
        this.flagCc = flagCc;
        this.idGruppo = idGruppo;
    }



    public Destinatario(){}
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

    public Gruppo getIdGruppo() {
        return idGruppo;
    }

    public void setIdGruppo(Gruppo idGruppo) {
        this.idGruppo = idGruppo;
    }

    @Override
    public String toString() {
        return "DestinatarioMail{" +
                "idDestinatario=" + idDestinatario +
                ", email='" + email + '\'' +
                ", flagCc=" + flagCc +
                ", idGruppo=" + idGruppo +
                '}';
    }

}
