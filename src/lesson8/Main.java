package lesson8;

import lesson9.Cat;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string");
        String input = scanner.nextLine();
//        String input = scanner.next();
        System.out.println(input.length());

        String notString = notString(input);
        System.out.println(notString);

        String front3 = front3(input);
        System.out.println(front3);

//        Human mike = new Human("Mike", 177, 95, 18);
        int[] biggerTwo = biggerTwo(new int[] {7,3}, new int[] {6,4});
        System.out.println(Arrays.toString(biggerTwo));
//        new Main().endUp(input);
        System.out.println(endUp(input));

    }

    public static String endUp(String string) {
//        Задано рядок. Повернути новий рядок, де останні 3 символи перетворені у верхній регістр.
//        Якщо рядок має менше ніж 3 символи, тоді перетворити у верхній регістр те, що є.
//        Зверніть увагу, що str.toUpperCase() повертає версію рядка у верхньому регістрі.
        if (string.length() <= 3) {
            return string.toUpperCase();
        }

        int index = string.length() - 3;
        String upperEnd = string.substring(index).toUpperCase();
        return string.substring(0, index).concat(upperEnd);
    }

    public static int[] biggerTwo(int[] firstArray, int[] secondArray) {
//        Дано: 2 цілих масивів a і b, кожен довжиною 2.
//        Розгляньте суму значень у кожному масиві.
//        Поверніть масив, сума значень якого найбільша. У разі рівності сум поверніть масив a.
        firstArray = Arrays.copyOf(firstArray, firstArray.length);
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < firstArray.length; i++) {
            firstSum += firstArray[i];
            secondSum += secondArray[i];
        }

        if (secondSum > firstSum) {
            return secondArray;
        }
        return firstArray;

//        return Arrays.stream(firstArray).sum() < Arrays.stream(secondArray).sum() ? secondArray : firstArray;
    }

    public static String notString(String string) {
//        Дано рядок. Повернути новий рядок, до якого було додано "not " на початок,
//        якщо рядок ще не починається з "not".
//        Проте, якщо рядок вже починається з "not", повернути незмінений рядок.
//        Зверніть увагу: використовуйте метод .equals() для порівняння двох рядків.

        if (string.startsWith("not")) {
            return string;
        }
//        StringBuilder sb = new StringBuilder("not ");
//        sb.append(string);
//        return sb.toString();
        return "not " + string;
    }

    public static String front3(String string) {
        if (string.length() < 3) {
            return string;
        }
//        String sub = string.substring(0, 3);
//        String result = sub.repeat(3);
//        return result;
        return string.substring(0, 3).repeat(3);
    }
}

class Human {
    String name;
    double height;
    double weight;
    int age;

    public Human(String name, double height, double weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
}