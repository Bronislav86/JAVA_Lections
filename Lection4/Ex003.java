package Lection4;

import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Deque<Object> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(12);
        deque.add(52);
        deque.add(92);
        System.out.println(deque);

        deque.addFirst(1); deque.addLast(2);
        System.out.println(deque);
        deque.removeFirst(); deque.removeLast();
        System.out.println(deque);
        deque.offerFirst(1); deque.offerLast(2);
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.getFirst()); System.out.println(deque.getLast());
        System.out.println(deque.peekFirst()); System.out.println(deque.peekLast());


    }
}