package Methods;

public class Demo4_NonVoid {
    public static int sum(int a, int b)
    {
        int result = a + b;
        return  result;
    }

    public static double sum(int a, double b)
    {
        double result = a + b;
        return  result;
    }

    public static Object sum(double a, double b)
    {
        double result = a + b;
        return  result;
    }


    public static void main(String[] args) {
        //1st way
       int res = sum(2,3);
        System.out.println(res);

        //2nd way
        System.out.println(sum(3,4));

        System.out.println(sum(2,3.0));
    }
}
