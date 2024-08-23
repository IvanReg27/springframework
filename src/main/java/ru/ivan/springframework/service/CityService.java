package ru.ivan.springframework.service;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.ivan.springframework.dto.CityDto;
import ru.ivan.springframework.entity.City;
import ru.ivan.springframework.repository.CityRepository;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CityService {

    private final CityRepository cityRepository;
    private final ModelMapper modelMapper;

    public List<CityDto> getCities() {
        List<City> cityList = cityRepository.findAll();
        return cityList.stream()
                .map(city -> modelMapper.map(city, CityDto.class))
                .collect(Collectors.toList());
    }
    public CityDto saveCity(CityDto cityDto) {
        City city = modelMapper.map(cityDto, City.class);
        return modelMapper.map(cityRepository.save(city), CityDto.class);
    }
}
