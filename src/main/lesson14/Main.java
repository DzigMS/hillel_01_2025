package lesson14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 1, 5, 8, 6, 7, 4, 0, 9, 5, 5);
        int goal = 10;

        System.out.println(findUniquePairs(integers, goal));

        List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 3, 4, 6, 8, 10, 12, 17);

        System.out.println(mergeSortedLists(list1, list2));

        Map<String, String> food = new HashMap<>();
        food.put("ice_cream", "cherry");
        System.out.println(modifyFoodMap(food));
        food.clear();
//        food = new HashMap<>();
        food.put("spinach", "dirt");
        food.put("ice_cream", "cherry");
        System.out.println(modifyFoodMap(food));

//        food.clear();
//        food.put("yogurt", "salt");
//        System.out.println(modifyFoodMap(food));

        Set<String> keys = food.keySet();
        for (String key: keys) {
            System.out.println("key: " + key + " value: " + food.get(key));
        }

        Set<Map.Entry<String, String>> foods = food.entrySet();

        for (Map.Entry<String, String> dishes: foods) {
            System.out.println("key: " + dishes.getKey() + " value: " + dishes.getValue());
        }
    }

//    Необхідно модифікувати цей словник за такою умовою: якщо ключ "ice cream" має значення,
//    встановити це значення для ключа "yogurt" також. Якщо ключ "spinach" має значення,
//    замінити це значення на "nuts".
    public static Map<String, String> modifyFoodMap(Map<String, String> foodMap) {
        if (foodMap.get("ice_cream") != null) {
            foodMap.put("yogurt", foodMap.get("ice_cream"));
        }

        if (foodMap.get("spinach") != null) {
            foodMap.put("spinach", "nuts");
        }

        return foodMap;
    }


//    Дано два відсортованих списки.
//    Об'єднайте їх в один відсортований список без використання
//    вбудованих функцій сортування.
    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        int firstListIndex = 0;
        int secondListIndex = 0;

        List<Integer> mergedList = new ArrayList<>();

        while (firstListIndex < list1.size() && secondListIndex < list2.size()) {
            if (list1.get(firstListIndex) < list2.get(secondListIndex)) {
                mergedList.add(list1.get(firstListIndex));
                firstListIndex++;
            } else {
                mergedList.add(list2.get(secondListIndex));
                secondListIndex++;
            }
        }

        if (firstListIndex < list1.size()) {
            mergedList.addAll(list1.subList(firstListIndex, list1.size()));
        } else if (secondListIndex < list2.size()) {
            mergedList.addAll(list2.subList(secondListIndex, list2.size()));
        }


        return mergedList;
    }





//    Дано список цілих чисел та цільове число.
//    Поверніть усі унікальні пари чисел зі списку, які утворюють цю суму.
    public static List<List<Integer>> findUniquePairs(List<Integer> nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0; i < nums.size(); i++) {
//            int number = nums.get(i);
//            int findNumber = targetSum - number;
//        }

        for (int i = 0; i <= targetSum; i++) {
            int findNumber = targetSum - i;
            if (nums.contains(i) && nums.contains(findNumber)) {
                if (i == findNumber && nums.indexOf(i) == nums.lastIndexOf(i)) {
                    continue;
                }
                ArrayList<Integer> innerList = new ArrayList<>();
                innerList.add(i);
                innerList.add(findNumber);

                result.add(innerList);

//                result.add(Arrays.asList(i, findNumber));
            }
        }
        return result;
    }
}
