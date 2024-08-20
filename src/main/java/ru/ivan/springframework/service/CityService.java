package ru.ivan.springframework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ivan.springframework.dto.CityDto;

@Component
public class CityService {
    @Autowired
    private CityDto cityDto;
    public String getCityName() {
        return cityDto.getName();
    }
}
