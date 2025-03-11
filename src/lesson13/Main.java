package lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //        char      -> Character
        //        byte      -> Byte
        //        short     -> Short
        //        int       -> Integer
        //        long      -> Long
        //        double    -> Double
        //        float     -> Float
        //        boolean   -> Boolean

        ArrayList integers = new ArrayList(Arrays.asList(5, 10, 20, 30));

        //        int[] -> Integer[]
        integers.add(5);
        integers.add(10);
        integers.add("asda");

        LinkedList<Integer> linkedList = new LinkedList<>(integers);






    }

    public static List<Integer> getIntegers() {
        List<Integer> integers;
        if (true) {
            integers = new ArrayList<>();
        }else {
            integers = new LinkedList<>();
        }

        return integers;
    }
}
