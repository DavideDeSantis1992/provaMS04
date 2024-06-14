package com.example.MS4.client;

import com.example.MS4.model.DestinatarioMail;
import com.example.MS4.model.ProvaChiamata;
import com.example.MS4.repository.DestinatarioMailRepository;
import com.example.MS4.repository.ProvaChiamataRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MsxClient {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private ProvaChiamataRepository provaChiamataRepository;

    private  final Logger logger;

    public MsxClient(Logger logger) {
        this.logger = logger;
    }

    public ResponseEntity<String> getData(ProvaChiamata oggettoProvaChiamta){



        String url = "http://localhost:8084/send-data-msx";

        // DestinatarioMail messaggioDaMandare = new DestinatarioMail();
        ResponseEntity<String> response = null;
        try{
            logger.info("Avvio processo di ricezione dati");
            System.out.println("Sto ricevendo dati....");
            response = restTemplate.postForEntity(url, oggettoProvaChiamta, String.class);
            if(response.getStatusCode().is2xxSuccessful()){
                //messaggioDaMandare.setEmail(response.getBody());
/*
                messaggioDaMandare.setEmail(
                        oggettoProvaChiamta.getIdIstanzaProcesso()+""+
                        oggettoProvaChiamta.getStato()+""+
                        oggettoProvaChiamta.getTipo()+""+
                        oggettoProvaChiamta.getFrequenza());

 */
                ProvaChiamata daSalvare = new ProvaChiamata();
                daSalvare.setIdIstanzaProcesso(oggettoProvaChiamta.getIdIstanzaProcesso());
                daSalvare.setStato(oggettoProvaChiamta.getStato());
                daSalvare.setTipo(oggettoProvaChiamta.getTipo());
                daSalvare.setFrequenza(oggettoProvaChiamta.getFrequenza());
                System.out.println("sono quivi per prendere i dati da salvare");
                try{
                    System.out.println("sono quivi");
                    provaChiamataRepository.save(daSalvare);
                }catch (Exception e){
                    e.printStackTrace();
                    logger.error("Errore nel salvataggio del messaggio");
                }

            }
            return response.ok(response.getBody());
        } catch(Exception e){
            logger.error("Errore nel ricevere i dati");
            return response.badRequest().body("Errore nel ricevere i dati");
        }

    }
}
