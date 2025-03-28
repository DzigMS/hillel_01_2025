package lesson11;

public class Surgery extends Doctor {
    public Surgery(String name) {
        super(name, "Surgery");
    }

    public void surgery(){
        System.out.println("Processing surgery");
    }
}
