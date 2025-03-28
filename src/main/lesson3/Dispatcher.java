package lesson3;

public class Dispatcher {

    public static void main(String[] args) {
//        System.out.println("Hello Mike");
//        System.out.println("Hello " + args[0]);
//        System.out.println("Hello " + args[1]);
//        System.out.println("Hello " + args[2]);

        int number;
        number = 10;
        System.out.println(number);

        int secondNumber = 20;

        number = 15;
        System.out.println(number);

        int sum = number + secondNumber;
        System.out.println("sum of number and second number " + sum);

//        byte k = 127;
//        int x = k;
        int x = 257;
        byte k = (byte) x;

        System.out.println(k);
    }
}

