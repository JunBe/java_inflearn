package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        //코드 작성
        Set<Integer> addSet = new HashSet<>(set1);
        addSet.addAll(set2);
        System.out.println("합집합: " + addSet);

        Set<Integer> interSet = new HashSet<>(set1);
        interSet.retainAll(set2);
        System.out.println("교집합: " + interSet);

        Set<Integer> diffSet = new HashSet<>(set1);
        diffSet.removeAll(set2);
        System.out.println("차집합: "+diffSet);


    }
}
