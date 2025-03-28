package lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[15];
        int[] arr2 = new int[]{5, 2, 3, 2};
        int[] arr1 = new int[arr2.length];

//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = arr2[i];
//        }

        arr1 = Arrays.copyOf(arr2, arr2.length);

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));

        arr2[1] = 7;
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));


//        System.out.println(Arrays.toString(arr2));
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
//
//        int k = arr2[2];
//        System.out.println(k);
//        System.out.println(arr);
//        System.out.println(Arrays.toString(arr));


//        int[] arr = new int[5];
//        String[] strings = new String[7];
//        boolean[] booleans = new boolean[3];
//
//        arr[3] = 37;
//        strings[6] = "hello";

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int number : arr) {
//            System.out.println(number);
//        }
//
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }
//
//        for (int i = 0; i < booleans.length; i++) {
//            System.out.println(booleans[i]);
//        }

    }
}
