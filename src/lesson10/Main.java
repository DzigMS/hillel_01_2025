package lesson10;

import lesson9.Cat;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Sirko", "Buldog");

        Cat cat = new Cat("Pixi", "White", new Date(2022, 02, 24), 4.5);
//        System.out.println(cat.getName());

        System.out.println(dog.getName());
        System.out.println(dog.getBreed());

        cat.voice();
        dog.voice();
    }
}
