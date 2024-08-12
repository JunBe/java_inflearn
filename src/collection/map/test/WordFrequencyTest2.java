package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        //코드 작성
        String[] arr = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String key : arr) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        System.out.println(map);
    }
}
