package ru.ivan.springframework.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.ivan.springframework.dto.CityDto;
import ru.ivan.springframework.service.CityService;

import java.util.List;

@RestController
@RequestMapping("/city")
@AllArgsConstructor
public class CityController {

    private final CityService service;

    @GetMapping("/findCities")
    public List<CityDto> findCities() {
        return service.getCities();
    }
    @PostMapping("/saveCity")
    public  CityDto saveCity(@RequestBody CityDto cityDto) {
        return service.saveCity(cityDto);
    }
}
