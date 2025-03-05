package lesson9;

import java.util.Date;

public class Animal {
    protected String name;
    protected String color;
    protected Date dob;
    protected double weight;

    public Animal(String name, String color, Date dob, double weight) {
        this.name = name;
        this.color = color;
        this.dob = dob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void voice() {
        System.out.println("Hello from Animal, my name is: " + name);
    }

    public void eat(Food food) {
        System.out.println("Cat + " + name + " eat food " + food.getName());
    }
}
