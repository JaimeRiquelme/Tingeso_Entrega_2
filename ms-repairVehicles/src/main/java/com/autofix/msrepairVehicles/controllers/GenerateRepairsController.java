package com.autofix.msrepairVehicles.controllers;

import com.autofix.msrepairVehicles.models.vehiclesEntity;
import com.autofix.msrepairVehicles.services.GenerateRepairsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/repairVehicles")
@CrossOrigin("*")
public class GenerateRepairsController {

    @Autowired
    GenerateRepairsServices GenerateRepairsServices;

    @GetMapping("/")
    public ResponseEntity<Iterable<vehiclesEntity>> listVehicles(){
        return ResponseEntity.ok(GenerateRepairsServices.listVehicles());
    }
}
