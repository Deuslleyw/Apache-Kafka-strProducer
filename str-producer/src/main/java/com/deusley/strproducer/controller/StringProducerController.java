package com.deusley.strproducer.controller;

import com.deusley.strproducer.services.StringProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/producer")
public class StringProducerController {

    private final StringProducerService prodService;

    public ResponseEntity <?> sendMessage(@RequestBody String message){
        prodService.sendMessage(message);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
