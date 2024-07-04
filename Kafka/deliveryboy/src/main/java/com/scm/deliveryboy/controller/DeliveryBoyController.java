package com.scm.deliveryboy.controller;

import com.scm.deliveryboy.service.DeliveryBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class DeliveryBoyController {

    private final DeliveryBoyService deliveryBoyService;

    @Autowired
    public DeliveryBoyController(DeliveryBoyService deliveryBoyService) {
        this.deliveryBoyService = deliveryBoyService;
    }

    @PostMapping("/update")
    public ResponseEntity<?> send() {
        String s = "";
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            s = deliveryBoyService.send(" " + Math.random()) + " , " + Math.random();
            System.out.println();
        }
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}
