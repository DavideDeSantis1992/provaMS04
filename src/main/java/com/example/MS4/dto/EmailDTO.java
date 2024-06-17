package com.example.MS4.dto;

import com.example.MS4.model.Email;
import com.example.MS4.model.Gruppo;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//package com.example.MS4.dto;
//public class EmailDTO {
//    private String idIstanzaProcesso;
//    private String stato;
//    private String tipo;
//    private String frequenza;
//
//    /**
//     * @param id
//     * @param idIstanzaProcesso
//     * @param stato
//     * @param tipo
//     * @param frequenza
//     */
//    public EmailDTO(Long id, String idIstanzaProcesso, String stato, String tipo, String frequenza) {
//        super();
//        this.idIstanzaProcesso = idIstanzaProcesso;
//        this.stato = stato;
//        this.tipo = tipo;
//        this.frequenza = frequenza;
//    }
//
//    public EmailDTO() {
//    }
//
//    public String getIdIstanzaProcesso() {
//        return idIstanzaProcesso;
//    }
//
//    public void setIdIstanzaProcesso(String idIstanzaProcesso) {
//        this.idIstanzaProcesso = idIstanzaProcesso;
//    }
//
//    public String getStato() {
//        return stato;
//    }
//
//    public void setStato(String stato) {
//        this.stato = stato;
//    }
//
//    public String getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(String tipo) {
//        this.tipo = tipo;
//    }
//
//    public String getFrequenza() {
//        return frequenza;
//    }
//
//    public void setFrequenza(String frequenza) {
//        this.frequenza = frequenza;
//    }
//
//    @Override
//    public String toString() {
//        return "stato=" + stato + ", tipo=" + tipo
//                + ", frequenza=" + frequenza + "]";
//    }
//
//
//}
public class EmailDTO{
    private String bodyEmail;
    private Long idGruppo;

    public EmailDTO(Email email){
        this.bodyEmail = email.getBodyEmail();
        this.idGruppo = email.getIdGruppo().getId();
    }

    public EmailDTO(){}

    public String getBodyEmail() {
        return bodyEmail;
    }

    public void setBodyEmail(String bodyEmail) {
        this.bodyEmail = bodyEmail;
    }

    public Long getIdGruppo() {
        return idGruppo;
    }

    public void setIdGruppo(Long idGruppo) {
        this.idGruppo = idGruppo;
    }
}
