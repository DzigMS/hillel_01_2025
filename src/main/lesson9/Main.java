package lesson9;

import lesson10.Dog;

import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Request r = new Request();
//        RequestBody rb = new RequestBody();
//        r.setBody(rb);
//        Response response = client.send(r);
//        response.getStatus();
//
//
//        Cat cat = new Cat("Murzik", "Black", new Date(2022, 02, 24), 3.5);
        Cat cat = new Cat("Black", "Murzik", new Date(2022, 02, 24), 3.5);
//        System.out.println(cat.name);
//        Dog dog = new Dog();

//        Cat cat = new Cat("dfsd", 43);
//        Cat cat = new Cat();
//        cat.name = "Murzik";
//        cat.setName("Murzik");
//        cat.setColor("Black");
//        cat.setWeight(3.5);
        cat.voice();
//        System.out.println(cat.getColor());
//        System.out.println(cat.getColor());
//        System.out.println(cat.getColor());
//        System.out.println(cat.getColor());
//        System.out.println(cat.getWeight());
//        System.out.println(cat.getAge());
//        System.out.println(cat);

//        cat.setName("Pixi");
//        cat.voice();
//        System.out.println(cat);
    }
}
