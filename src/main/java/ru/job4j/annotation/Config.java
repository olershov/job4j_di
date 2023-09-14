package ru.job4j.annotation;

import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "ru/job4j/annotation")
@PropertySource("classpath:application.properties")
public class Config {

    @Order(3)
    @Primary
    @Bean
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Order(2)
    @Bean(name = "Second Dog")
    public Dog getDog() {
        return new Dog("secondDog");
    }

    @Order(1)
    @Bean
    public Dog someDog() {
        return new Dog("someDog");
    }
}