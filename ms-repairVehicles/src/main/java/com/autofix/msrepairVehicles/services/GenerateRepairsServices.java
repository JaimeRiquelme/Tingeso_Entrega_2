package com.autofix.msrepairVehicles.services;

import com.autofix.msrepairVehicles.clients.VehiclesFeignClient;
import com.autofix.msrepairVehicles.models.vehiclesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerateRepairsServices {

    private final VehiclesFeignClient vehiclesFeignClient;

    @Autowired
    public GenerateRepairsServices(VehiclesFeignClient vehiclesFeignClient) {
        this.vehiclesFeignClient = vehiclesFeignClient;
    }

    public Iterable<vehiclesEntity> listVehicles() {
        return vehiclesFeignClient.listVehicles();
    }
}
