package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table
public class EmailCorpo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bodyEmail;

    @ManyToOne
    @JoinColumn(name = "idGruppoNotifica")
    private GruppoNotifica idGruppoNotifica;


    public EmailCorpo(Long id, String bodyEmail, GruppoNotifica idGruppoNotifica) {
        this.id = id;
        this.bodyEmail = bodyEmail;
        this.idGruppoNotifica = idGruppoNotifica;
    }


    public EmailCorpo(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBodyEmail() {
        return bodyEmail;
    }

    public void setBodyEmail(String bodyEmail) {
        this.bodyEmail = bodyEmail;
    }

    public GruppoNotifica getIdGruppoNotifica() {
        return idGruppoNotifica;
    }

    public void setIdGruppoNotifica(GruppoNotifica idGruppoNotifica) {
        this.idGruppoNotifica = idGruppoNotifica;
    }

    @Override
    public String toString() {
        return "EmailCorpo{" +
                "id=" + id +
                ", bodyEmail='" + bodyEmail + '\'' +
                ", idGruppoNotifica=" + idGruppoNotifica +
                '}';
    }
}
