package lesson12;

import lesson11.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "Green", new Engine("2.5"));

//        car.engine = new Engine("1.0");
        car.engine.setVolume("1.0");
    }
}
