/**
 * program
 */
public class program {
    public static void main(String[] args) {
        // System.out.println("bye world"); //sysout - быстрый ввод
        System.out.println("world");

        // String s = null;
        // System.out.println(s);

        // float f = 123.45f;
        // double d = 123.45;
        // char ch = 123;
        // System.out.println(ch);

        // boolean b = true ^ false;
        // System.out.println(b);

        // var i = 123;
        // System.out.println(i);
        // var d = 123.456;
        // System.out.println(d);
        // System.out.println(getType(i));
        // System.out.println(getType(d));

        // int i = 23_123_34;
        // System.out.println(Integer.MAX_VALUE);

        // String s = "qwerty";
        
        // System.out.println(s.charAt(1));

        // int a = 8;
        // // 1000
        // a = a << 1;
        // System.out.println(a);
        // // 10000

        // int a = 18;
        // // 10010
        // a = a >> 1;
        // System.out.println(a);
        // // 1001
        
        // int a = 5;
        // int b = 2;
        // System.out.println(a | b);
        // // 101
        // // 010
        // // 111

        // String s = "qwe1";
        // // boolean b = s.length() >= 5 && s.charAt(4) == '1';
        // boolean b = s.length() >= 5 & s.charAt(4) == '1';
        // System.out.println(b);


        int [] arr = new int[10];
        arr[3] = 13;
        System.out.println(arr[3]);

   
     
    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    } 
    
}