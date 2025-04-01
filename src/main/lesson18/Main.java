package lesson18;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

    public int getMostFrequently(List<Integer> list) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (Integer num: list) {
            int count = counter.getOrDefault(num, 0);
            counter.put(num, count+1);
//            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        int mostFrequently = 0;
        int mostFrequentlyCount = 0;

        for (Map.Entry<Integer, Integer> entry: counter.entrySet()) {
            if (mostFrequentlyCount < entry.getValue()){
                mostFrequently = entry.getKey();
            }
        }

        return mostFrequently;
    }
}
