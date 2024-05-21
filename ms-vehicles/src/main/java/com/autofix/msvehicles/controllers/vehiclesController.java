package com.autofix.msvehicles.controllers;

import com.autofix.msvehicles.entities.vehiclesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.autofix.msvehicles.services.vehiclesService;

@RestController
@RequestMapping("/api/v1/vehicles")
@CrossOrigin("*")
public class vehiclesController {

    @Autowired
    vehiclesService vehiclesService;

    @PostMapping("/")
    public ResponseEntity<vehiclesEntity> saveVehicle(@RequestBody vehiclesEntity vehicle) {
        vehiclesEntity vehicleNew = vehiclesService.saveVehicle(vehicle);
        return ResponseEntity.ok(vehicleNew);
    }
}
