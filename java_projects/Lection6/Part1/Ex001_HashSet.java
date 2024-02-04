package Lection6.Part1;

import java.util.*;

public class Ex001_HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(55, 88, 77, 66));
        // list.add(55);
        // list.add(88);
        // list.add(77);
        // list.add(66);
        Queue<Integer> queue = new ArrayDeque<>(list);
        System.out.println("Очередь со стэклм внутри: " + queue);
        System.out.println("Лист: " + list);
        set.add(1); set.add(12); set.add(123);
        set.add(1234); set.add(1234);
        System.out.println(set.contains(12)); // true
        set.add(null);
        set.add(5);
        System.out.println(set.size()); // 5
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(12);
        set.addAll(list);
        System.out.println("Сет с листом: " + set);
        System.out.println(set.size());
        for (var item : set) {
            System.out.println(item); // null 1 1234 123
        }
        // set.clear();
        set.removeAll(set);
        System.out.println(set); // []
    }
}