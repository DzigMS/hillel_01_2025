package lesson5;

public class Main {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
//        String someString = args[2];

        System.out.println("first number = " + firstNumber);
        System.out.println("second number = " + secondNumber);

//        + - / * %
//        == > < >= <= !=

        int result = firstNumber + secondNumber * 2;
//        System.out.println(result);
//        firstNumber = secondNumber;
//        System.out.println(firstNumber == secondNumber);
        double doubleNumber = 20;
//        System.out.println(doubleNumber);
        firstNumber += 7;
        firstNumber = firstNumber + 7;

//        System.out.println((double) secondNumber/firstNumber);

        boolean isEven;
        boolean isPrime;

        int divisionResult = firstNumber % 2;

//        if (divisionResult == 0) {
//            isEven = true;
//        } else {
//            isEven = false;
//        }

        isEven = divisionResult == 0;
        System.out.println(isEven);

//        if (isEven) {
//            System.out.println("First number is even");
//        } else {
//            System.out.println("First number is odd");
//        }
//        else if () {
//
//        } else if () {
//
//        }

//        if () {
//
//        }
//        if () {}

        switch (args[0]) {
            case "37":
                System.out.println("case 37");
//                break;
            case "38":
                System.out.println("case 38");
                break;
            case "36":
                System.out.println("case 36");
            default:
                System.out.println("default case");
        }


//        System.out.println("next step");
//        int i = 0;
//        for (; i < args.length; i += 1) {
//            System.out.println(args[i]);
//        }

//        for (String s : args) {
//            System.out.println(s);
//        }


//        while (i != 0) {
//            System.out.println(i);
//            i -= 1;
//        }

//        do {
//            System.out.println(i);
//            i -= 1;
//        } while (i != 0);
//        System.out.println("i = " + i);
    }

    int methodName() {
        return 0;
    }
}
