package com.tobil.airportapi.service;

import com.tobil.airportcore.model.PlaneDto;
import org.springframework.stereotype.Service;

@Service
public class PlaneService {
    
    public PlaneDto getPlane() {
        return new PlaneDto("jet plane", 5);
    }

}
