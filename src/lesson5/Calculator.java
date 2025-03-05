package lesson5;

public class Calculator {
    static int sum(int firstNumber, int secondNumber) {
        int result;
        result = firstNumber + secondNumber;
        return result;
    }

    static int sum(int firstNumber, int secondNumber, int ... otherNumbers) {
        int result = sum(firstNumber, secondNumber);

        for (int number : otherNumbers) {
            result = sum(result, number);
        }

        return result;
    }

//    static int sum(int firstNumber, int secondNumber, int thirdNumber) {
//        return sum(sum(firstNumber, secondNumber), thirdNumber);
//    }
//
//    static int sum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
//        return sum(sum(firstNumber, secondNumber), thirdNumber);
//    }

    static int power(int firstNumber, int secondNumber) {
        int result = 1;

        for (int i = 1; i <= secondNumber; i++) {
            result *= firstNumber;
        }
        return result;
    }

    static long factorial(int n) {
        if (n < 0) {
            return 0;
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
//            result = result * i;
            result *= i;
        }

        return result;
    }

    static long factorial_recursion(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
//        n! = (n-1)! * n
        return n * factorial_recursion(n - 1);
//        n * (n-1)!
//        (n-1) * (n-2)!
    }

    public static void main(String[] args) {
//        n! = 1 * 2 * 3 * ... * (n-1) * n
        int n = 7;
        System.out.println(factorial(n));
        System.out.println(factorial_recursion(n));

        System.out.println(sum(2,3,4));
        System.out.println(sum(3,7,10, 15, 25));
    }
}
