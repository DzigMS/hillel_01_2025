package lesson11;

import lesson12.Engine;

public class Car {
    public class InnerClass {
    }

    public static class NestedClass {
    }

    private static int quantity;

    private String brand;
    private String color;
    public final Engine engine;


    public Car(String brand, String color, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        quantity++;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getQuantity() {
        return quantity;
    }
}
