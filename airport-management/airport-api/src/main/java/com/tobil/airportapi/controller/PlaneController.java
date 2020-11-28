package com.tobil.airportapi.controller;

import com.tobil.airportapi.service.PlaneService;
import com.tobil.airportcore.model.PlaneDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlaneController {

    @Autowired
    PlaneService planeService;

    @GetMapping("/plans")
    public ResponseEntity<PlaneDto> getPlane(){
        PlaneDto planeDto = planeService.getPlane();

        return new ResponseEntity<>(planeDto, HttpStatus.OK);
    }
}
