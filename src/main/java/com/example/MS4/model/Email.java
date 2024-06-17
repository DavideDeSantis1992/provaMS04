package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmail;
    private String bodyEmail;

    @ManyToOne
    @JoinColumn(name = "idGruppo")
    private Gruppo idGruppo;


    public Email(Long idEmail, String bodyEmail, Gruppo idGruppo) {
        this.idEmail = idEmail;
        this.bodyEmail = bodyEmail;
        this.idGruppo = idGruppo;
    }


    public Email(){}

    public Long getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(Long idEmail) {
        this.idEmail = idEmail;
    }

    public String getBodyEmail() {
        return bodyEmail;
    }

    public void setBodyEmail(String bodyEmail) {
        this.bodyEmail = bodyEmail;
    }

    public Gruppo getIdGruppo() {
        return idGruppo;
    }

    public void setIdGruppo(Gruppo idGruppo) {
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
