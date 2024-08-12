package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        //코드 작성
        Set<Integer> addSet = new HashSet<>();
        for (Integer val : set1) {
            addSet.add(val);
        }
        for (Integer val : set2) {
            addSet.add(val);
        }
        System.out.println("합집합: " + addSet);

        Set<Integer> interSet = new HashSet<>();
        for (Integer val : set2) {
            if (set1.contains(val)) {
                interSet.add(val);
            }
        }
        System.out.println("교집합: " + interSet);

        Set<Integer> diffSet = new HashSet<>();
        for (Integer val : set1) {
            if (!set2.contains(val)) {
                diffSet.add(val);
            }
        }
        System.out.println("차집합: "+diffSet);


    }
}
