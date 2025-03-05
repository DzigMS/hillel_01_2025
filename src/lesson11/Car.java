package lesson11;

public class Car {
    public class InnerClass {
    }

    public static class NestedClass {
    }

    private static int quantity;

    private String brand;
    private String color;


    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        quantity++;
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
