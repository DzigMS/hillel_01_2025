package lesson10;

import lesson9.Animal;
import lesson9.Cat;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Animal pet;

        Dog dog = new Dog("Sirko", "Buldog");
        pet = dog;

        Cat cat = new Cat("Pixi", "White", new Date(2022, 02, 24), 4.5);
//        System.out.println(cat.getName());

        System.out.println(dog.getName());
        System.out.println(dog.getBreed());

//        cat.voice();
//        pet.voice();
//        pet = cat;

//        pet.voice();
//        dog.voice();

        Animal[] animals = new Animal[] {cat, dog};

        for (Animal a : animals) {
            a.voice();
        }
    }
}
