package org.example.fuel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/fuel")
public class FuelController {
private final FuelRepo fuelRepo;

public FuelController(FuelRepo fuelRepo) {
	this.fuelRepo = fuelRepo;
}

@GetMapping
public List<FuelData> getAllFuelData() {
	return fuelRepo.findAll();
}

@GetMapping("/{id}")
public FuelData getStationById(@PathVariable String id) {
	return fuelRepo.findById(id).orElseThrow(() -> new RuntimeException("not found"));
}
}
