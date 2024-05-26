package com.autofix.ms_reports.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ms-repairVehicles", path = "/api/v1/repairVehicles")
public class RepairVehiclesFeignClient {

    
}
