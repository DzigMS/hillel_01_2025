package lesson10;

import lesson9.Animal;

import java.util.Date;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String color, Date dob, double weight) {
        super(name, color, dob, weight);
    }

    public Dog() {
        super(null, "Brown", new Date(2022, 02, 24), 4);
    }

    public Dog(String breed) {
        super("Patron", "Brown", new Date(2022, 02, 24), 4);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, "Brown", new Date(2022, 02, 24), 4);
        this.breed = breed;
    }

    public String getDogName() {
        return this.name;
    }

    public String getBreed() {
        return breed;
    }

    public void voice() {
        System.out.println("Woof, my name is: " + name);
    }
}
