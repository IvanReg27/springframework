package ru.ivan.springframework.dto;

import org.springframework.stereotype.Component;

@Component
public class CityDto {
    public String name = "Saint Petersburg";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
