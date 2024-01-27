package Lection3;

import java.util.ArrayList;
import java.util.List;

public class Ex006_ListOf {
    public static void main(String[] args) {
        // Character value = null;
        // List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        // System.out.println(list1);
        // list1.remove(1); // java.lang.UnsuppotedOperationException - просто так удалить элменты из коллекции созданной при помощи ListOf не получится
        // List<Character> list2 = List.copyOf(list1);

        // а так все получится:

        //Character value = null;
        List<Character> list1 = new ArrayList<Character>();
        list1.add('S');
        list1.add('e');
        list1.add('r');
        list1.add('g');
        System.out.println(list1);
        list1.remove(1); // java.lang.UnsuppotedOperationException - просто так удалить элменты из коллекции созданной при помощи ListOf не получится
        System.out.println(list1);
        
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);
    }
}
