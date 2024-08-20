package ru.ivan.springframework;

import ru.ivan.springframework.dto.CityDto;
import ru.ivan.springframework.service.CityService;

public class App {
    public static void main(String[] args) {
        CityDto cityDto = new CityDto();
        CityService service = new CityService();
        System.out.println(service.getCityName(cityDto));
    }
}
