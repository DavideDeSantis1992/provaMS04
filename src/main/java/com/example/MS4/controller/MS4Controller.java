//package com.example.MS4.controller;
//
//import com.example.MS4.client.MSXClient;
//import com.example.MS4.dto.EmailDTO;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//
//import java.util.Queue;
//
//
//@RestController
//public class MS4Controller {
//
//    private final org.slf4j.Logger logger;
//    private final RestTemplate restTemplate;
//    private final MSXClient msxClient;
//    private static Queue<EmailDTO> emails;
//
//    public MS4Controller(MSXClient msxClient) {
//        this.restTemplate = new RestTemplate();
//        this.logger = LoggerFactory.getLogger(MS4Controller.class);
//        this.msxClient = msxClient;
//    }
//
//    @GetMapping("get-datas")
//    public ResponseEntity<EmailDTO> getDatas(){
//        EmailDTO emailDTO = new EmailDTO();
//        emailDTO.setStato("Lavorato");
//        emailDTO.setTipo("Malattia");
//        emailDTO.setIdIstanzaProcesso("Ciao");
//        emailDTO.setFrequenza("Mensile");
//        return ResponseEntity.ok(emailDTO);
//    }
//    /**
//     * Mock attivare servizio
//     */
//    @GetMapping("check")
//    public ResponseEntity<EmailDTO> check(){
//        //emails.add(msxClient.getData().getBody());
//        return msxClient.getData();
//    }
//
//    @GetMapping("getEmail")
//    public ResponseEntity<EmailDTO> getEmail() throws InterruptedException {
//        if(msxClient.getData() != null){
//            sendEmail(msxClient.getData().getBody());
//        }
//        return msxClient.getData();
//    }
//
//    @PostMapping("email-sent")
//    public ResponseEntity<String> emailSent(@RequestBody EmailDTO emailDTO){
//        logger.info("Email inviata:" + emailDTO.toString());
//        return ResponseEntity.ok().body("Email inviata: "+ emailDTO);
//    }
//
//    @PostMapping("send-email")
//    public ResponseEntity<String> sendEmail(@RequestBody EmailDTO emailDTO) {
//        ResponseEntity<String> response = null;
//        try {
//            logger.info("Avvio processo di invio mail");
//            String url = "http://localhost:8084/email-sent";
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            //emailDTO = emails.element();
//
//            HttpEntity<EmailDTO> requestEntity = new HttpEntity<>(emailDTO, headers);
//            Thread.sleep(5000);
//            response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
//            return response.ok(emailDTO.toString());
//
//        } catch (Exception err) {
//            logger.error("Errore nel invio della mail");
//            err.printStackTrace();
//            return response.badRequest().body("Errore nell' invio del messaggio");
//        } finally {
//            logger.info("Risultato dell' invio");
//            System.out.println(emailDTO.toString());
//        }
//
//    }
//}
