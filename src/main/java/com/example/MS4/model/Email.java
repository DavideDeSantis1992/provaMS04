package com.example.MS4.model;

import javax.persistence.*;

@Entity
@Table(name="EMAIL")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bodyEmail;
    @ManyToOne
    @JoinColumn(name="idGruppo", referencedColumnName = "id")
    private Gruppo idGruppo;

    public Email() {
    }

    public Email(Long id, String bodyEmail, Gruppo idGruppo) {
        this.id = id;
        this.bodyEmail = bodyEmail;
        this.idGruppo = idGruppo;
    }

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

    public Gruppo getIdGruppo() {
        return idGruppo;
    }

    public void setIdGruppo(Gruppo idGruppo) {
        this.idGruppo = idGruppo;
    }


}
