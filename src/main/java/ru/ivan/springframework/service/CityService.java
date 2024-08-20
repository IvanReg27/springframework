package ru.ivan.springframework.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ivan.springframework.dto.CityDto;
import ru.ivan.springframework.entity.City;
import ru.ivan.springframework.repository.CityRepository;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CityService {
    @Autowired
    CityRepository cityRepository;
    @Autowired
    ModelMapper modelMapper;
    public List<CityDto> getCities() {
        List<City> cityList = cityRepository.findAll();
        return cityList.stream().map(p -> modelMapper.map(p, CityDto.class)).collect(Collectors.toList());
    }
}
