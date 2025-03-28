package lesson9;

import lesson12.Voicable;

import java.io.Serializable;
import java.util.Date;

public abstract class Animal implements Voicable, Comparable<Animal> {
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

    public void voice(String phrase) {
        System.out.println("Hello from Animal, my name is: " + name + " " + phrase);
    }

    public abstract void voice();

    public void eat(Food food) {
        System.out.println("Cat + " + name + " eat food " + food.getName());
    }

    public int compareTo(Animal animal) {
        return this.name.compareTo(animal.name);
//        return 0;
    }
}
