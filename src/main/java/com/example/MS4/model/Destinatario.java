package com.example.MS4.model;


import javax.persistence.*;

@Entity
@Table
public class Destinatario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String indirizzoEmail;
    @ManyToOne
    @JoinColumn(name="idGruppo", referencedColumnName = "id")
    private Gruppo idGruppo;
    private Boolean flagCC;

    public Destinatario(Long id, String indirizzoEmail, Gruppo idGruppo, Boolean flagCC) {
        this.id = id;
        this.indirizzoEmail = indirizzoEmail;
        this.idGruppo = idGruppo;
        this.flagCC = flagCC;
    }

    public Destinatario() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndirizzoEmail() {
        return indirizzoEmail;
    }

    public void setIndirizzoEmail(String indirizzoEmail) {
        this.indirizzoEmail = indirizzoEmail;
    }

    public Gruppo getIdGruppo() {
        return idGruppo;
    }

    public void setIdGruppo(Gruppo idGruppo) {
        this.idGruppo = idGruppo;
    }

    public Boolean getFlagCC() {
        return flagCC;
    }

    public void setFlagCC(Boolean flagCC) {
        this.flagCC = flagCC;
    }
}
