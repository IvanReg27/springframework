package ru.ivan.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ivan.springframework.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    CityService service;

    @GetMapping("/findCityName")
    public String findCityName() {
        return service.getCityName();

    }
}
