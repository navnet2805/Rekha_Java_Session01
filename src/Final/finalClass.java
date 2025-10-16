package Final;

public class finalClass {

    //Method Parameter
    public static void m01(final int n)
    {
        //System.out.println(n++);
    }

    public static void main(String[] args) {
        //variable
         final int a;
         a= 10;

         //final int         b  =  10;
         final finalClass obj = new finalClass();

         //b  = 20;
        //obj = new finalClass();

        finalClass obj1 = new finalClass();
    }

    //final at the class level --- we can not inherit : String
    String s = "Java";

}
