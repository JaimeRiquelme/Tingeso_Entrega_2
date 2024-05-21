package com.autofix.msvehicles.services;

import com.autofix.msvehicles.entities.vehiclesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.autofix.msvehicles.repositories.vehiclesRepository;

@Service
public class vehiclesService {

    @Autowired
    vehiclesRepository vehiclesRepository;

    //metodo para guardar
    public vehiclesEntity saveVehicle(vehiclesEntity vehicle){
        return vehiclesRepository.save(vehicle);
    }
}
