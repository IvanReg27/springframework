package ru.ivan.springframework.service;

import ru.ivan.springframework.dto.CityDto;

public class CityService {
    public String getCityName(CityDto cityDto) {
        return cityDto.getName();
    }
}
