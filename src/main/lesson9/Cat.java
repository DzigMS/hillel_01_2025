package lesson9;

import java.util.Date;

public class Cat extends Animal{
//    fields
//    private String name;
//    protected String color;
//    Date dob;
//    private double weight;

    public Cat(String name, String color, Date dob, double weight) {
        super(name, color, dob, weight);
//        super.name = name;
//        this.name = name;
//        this.color = color;
//        this.dob = dob;
//        this.weight = weight;
    }


    public void voice() {
        System.out.println("Meow " + name);
    }
//
//    public void eat(Food food) {
//        System.out.println("Cat + " + name + " eat food " + food.getName());
//    }
}
