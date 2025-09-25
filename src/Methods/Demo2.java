package Methods;

public class Demo2 {

    public static void sum()
    {
        System.out.println("from sum");
    }

    public static void sum(int a)
    {
        System.out.println("from sum with 1 integer parameter/arguments");
    }

    public static void main(String[] args) {
        sum();
        sum(5);
    }
}
