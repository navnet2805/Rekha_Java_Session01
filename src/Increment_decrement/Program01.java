package Increment_decrement;

public class Program01 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++); //post increment --10
        System.out.println(a); // 11
        int b= 10;
        System.out.println(++b); //pre-increment -- 11
        System.out.println(b);// 11
        int c = 10;
        System.out.println(--c); // pre-decrement -- 9
        System.out.println(c); //9
        int d= 10;
        System.out.println(d--); //post-decrement --10
        System.out.println(d); //9
    }
}
