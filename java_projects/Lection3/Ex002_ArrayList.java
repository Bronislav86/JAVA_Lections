package Lection3;

import java.util.ArrayList;
import java.util.List;

public class Ex002_ArrayList {
    public static void main(String[] args) {
       List <Integer> list = new ArrayList<Integer>();
    //    ArrayList list = new ArrayList();
       list.add(2809);
       list.add("1234");
       
       for (Object o : list){
        System.out.println(o);
       }
    }
}
