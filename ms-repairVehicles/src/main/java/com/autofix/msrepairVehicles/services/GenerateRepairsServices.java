package com.autofix.msrepairVehicles.services;

import com.autofix.msrepairVehicles.clients.VehiclesFeignClient;
import com.autofix.msrepairVehicles.models.vehiclesEntity;
import org.springframework.stereotype.Service;

@Service
public class GenerateRepairsServices {

    VehiclesFeignClient vehiclesFeignClient;

    public Iterable<vehiclesEntity> listVehicles(){
        return vehiclesFeignClient.listVehicles();
    }
}
