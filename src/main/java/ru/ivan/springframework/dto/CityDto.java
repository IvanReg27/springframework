package ru.ivan.springframework.dto;

import org.springframework.stereotype.Component;

@Component
public class CityDto {
    public int id = 1;
    public String name = "Saint Petersburg";
    public int population = 5597763;
    public String attractions = "Kazan Cathedral";
    public String subway = "Yes";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getAttractions() {
        return attractions;
    }

    public void setAttractions(String attractions) {
        this.attractions = attractions;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }
}
