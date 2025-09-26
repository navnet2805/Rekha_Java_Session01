package Methods;

public class Demo4_MethodOverloading {

    public static void sum(int a, int b)
    {
        System.out.println(a+b);
    }

    public static void sum(double a, double b)
    {
        System.out.println(a+b);
    }

    public static void sum(int a, float b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        sum(2,3);
        sum(2.0,4.0);
        sum(5.0,9);
        sum(5,5.0f);
    }

    public static void sum(double a, int b)
    {
        System.out.println(a+b);
    }
}
