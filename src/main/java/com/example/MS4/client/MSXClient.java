//package com.example.MS4.client;
//
//import com.example.MS4.controller.MS4Controller;
//import com.example.MS4.dto.EmailDTO;
//import com.example.MS4.dto.MessaggioDTO;
//import com.example.MS4.model.Email;
//import com.example.MS4.service.EmailService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.ResponseEntity;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//
//@Component
//public class MSXClient {
//
//    private final Logger logger;
//    private final RestTemplate restTemplate;
//    private final EmailService emailService;
//
//    public MSXClient(EmailService emailService, RestTemplate restTemplate) {
//        this.emailService = emailService;
//        this.restTemplate = new RestTemplate();
//        this.logger = LoggerFactory.getLogger(MS4Controller.class);
//    }
//
//
//
//
//    public ResponseEntity<EmailDTO> getData() {
//        String url = "http://localhost:8084/get-datas";
//        MessaggioDTO messaggioDto = new MessaggioDTO();
//        ResponseEntity<EmailDTO> response = null;
//        try {
//            logger.info("Avvio processo di ricezione dati");
//            //response = restTemplate.postForEntity(url, emailDTO, String.class);
//            response = restTemplate.getForEntity(url,EmailDTO.class);
//            if (response.getStatusCode().is2xxSuccessful()) {
//               // messaggioDto.setBodyEmail(response.getBody());
//                emailService.save(response.getBody());
//
//            }
//            return response.ok().body(response.getBody());
//
//        } catch (Exception err) {
//            logger.error("Errore nella ricezione dati");
//            err.printStackTrace();
//            return response.badRequest().body(null);
//        }
//
//    }
//
//
//}
