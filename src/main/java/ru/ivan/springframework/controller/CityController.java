package ru.ivan.springframework.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
