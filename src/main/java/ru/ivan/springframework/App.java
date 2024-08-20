package ru.ivan.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ivan.springframework.config.SpringConfig;
import ru.ivan.springframework.dto.CityDto;
import ru.ivan.springframework.service.CityService;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        CityService service = context.getBean(CityService.class);
        System.out.println(service.getCityName());
    }
}
