package AccessModifier.Package1;

public class PublicClass {
    static int i;

    public static void publicmethod()
    {
        System.out.println("from public method");
    }

    private static void privatemethod()
    {
        System.out.println("from private method");
    }


     static void defaultmethod()
     {
         System.out.println("from default method");
     }


    public static void main(String[] args) {
        publicmethod();
        privatemethod();
        defaultmethod();
    }
}
