package lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String someString1 = new String("Hello world");
        String someString2 = "Hello world";

        System.out.println(someString2);
        someString2.repeat(3);
        System.out.println(someString2);
//        System.out.println(s3);

//        String someString3 = new String("Hello world");
//        String someString4 = "Hello world";

//        String sumOfStrings = someString1 + " " + someString2;
//        someString1 = someString1.concat(someString2);

//        System.out.println(sumOfStrings);
//        System.out.println(sumOfStrings2);
//        System.out.println(someString1);

//        System.out.println(someString1.equals(someString2));
//        System.out.println("s1==s2 " + (someString1 == someString2));
//        System.out.println("s1==s3 " + (someString1 == someString3));
//        System.out.println("s1==s4 " + (someString1 == someString4));
//        System.out.println("s2==s3 " + (someString2 == someString3));
//        System.out.println("s2==s4 " + (someString2 == someString4));
//        System.out.println("s3==s4 " + (someString3 == someString4));

//        StringBuilder/StringBuffer
        StringBuilder stringBuilder = new StringBuilder("2.Hello world");
        System.out.println(stringBuilder);

//        stringBuilder.append("Hello world");
//        System.out.println(stringBuilder);

        stringBuilder.append(" also");
        stringBuilder.insert(3, "bla bla bla");

        stringBuilder.repeat(" and", 3);
        System.out.println(stringBuilder);
//        stringBuilder.toString();


//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
//        int[][] arr = new int[][]{
//                new int[]{0, 1, 2, 3},
//                new int[]{10, 11, 12, 13, 14},
//                new int[]{20, 21},
//                new int[]{},
//                new int[]{40, 41, 42, 43},
//        };
//        int[][] arr = new int[7][];

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("i=" + i);
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//            System.out.println(arr[i]);
//        }


    }
}
