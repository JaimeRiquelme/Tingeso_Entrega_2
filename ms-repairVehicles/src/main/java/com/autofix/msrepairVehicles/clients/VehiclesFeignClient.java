package com.autofix.msrepairVehicles.clients;


import com.autofix.msrepairVehicles.configurations.FeignClientConfig;

import com.autofix.msrepairVehicles.models.vehiclesEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ms-vehicles",
        path = "/api/v1/vehicles",
        configuration = {FeignClientConfig.class})
public interface VehiclesFeignClient {

    /*@PostMapping("/")
    public ResponseEntity<vehiclesEntity> saveVehicle(@RequestBody vehiclesEntity vehicle) {
        vehiclesEntity vehicleNew = vehiclesService.saveVehicle(vehicle);
        return ResponseEntity.ok(vehicleNew);
    }*/

    @PostMapping("/")
    vehiclesEntity saveVehicle(@RequestBody vehiclesEntity vehicle);

    /*@GetMapping("/")
    public ResponseEntity<Iterable<vehiclesEntity>> listVehicles() {
        Iterable<vehiclesEntity> vehicles = vehiclesService.getVehicles();
        return ResponseEntity.ok(vehicles);
    }*/

    @GetMapping("/")
    Iterable<vehiclesEntity> listVehicles();

    @GetMapping("/{patente}")
    vehiclesEntity getVehiclesByPatente(@PathVariable String patente);

    @DeleteMapping("/{id}")
    String deleteVehicle(@PathVariable long id);

    @GetMapping("/patentes")
    String[] findAllPatente();

}
