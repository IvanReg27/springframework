package ru.ivan.springframework.dto;

public class CityDto {
    private String name = "Saint Petersburg";

    // Default constructor
    public CityDto() {
    }

    // Constructor with name parameter
    public CityDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
