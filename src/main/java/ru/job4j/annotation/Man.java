package ru.job4j.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class Man {

    @Autowired
    private Dog dog;

    @Autowired
    @Qualifier("someDog")
    private Dog dog1;

    private Bird bird;
    private Cat cat;

    @Autowired
    public Man(Cat cat) {
        this.cat = cat;
    }

    @Autowired
    public void setBird(Bird bird) {
        this.bird = bird;
    }

    @Autowired
    private Set<Pet> pets;

    @Autowired
    private List<Pet<Dog>> dogs;

    @Autowired
    private Map<String, Pet<Dog>> mapDogs;

    public void print() {
        System.out.printf("My Dog: %s%n", dog.print());
        System.out.printf("My Second Dog: %s%n", dog1.print());
        System.out.printf("My Cat: %s%n", cat.print());
        System.out.printf("My Bird: %s%n", bird.print());
        System.out.println("pets:");
        pets.forEach(s -> System.out.println(s.print()));
        System.out.println("dogs:");
        dogs.forEach(s -> System.out.println(s.print()));
        System.out.println("mapDogs:");
        mapDogs.forEach((key, value) -> System.out.printf("%s - %s%n", key, value.print()));
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setDog1(Dog dog1) {
        this.dog1 = dog1;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void setDogs(List<Pet<Dog>> dogs) {
        this.dogs = dogs;
    }

    public void setMapDogs(Map<String, Pet<Dog>> mapDogs) {
        this.mapDogs = mapDogs;
    }
}
