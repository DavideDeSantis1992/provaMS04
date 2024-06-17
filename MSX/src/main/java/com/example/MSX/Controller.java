package com.example.MSX;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @PostMapping("send-data")
    public ResponseEntity<EmailDTO> getData(@RequestBody EmailDTO emailDto){
        return ResponseEntity.ok().body(emailDto);
    }
}
