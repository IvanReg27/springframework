package ru.ivan.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.ivan.springframework.dto.CityDto;
import ru.ivan.springframework.service.CityService;

@Configuration
@ComponentScan("ru.ivan.springframework")
public class SpringConfig {
}
