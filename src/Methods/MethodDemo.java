package Methods;

public class MethodDemo {

    public static void demoMethod() //called method
    {
        System.out.println("from demomethod");
    }

    public static void main(String[] args) {
        demoMethod(); //calling method
        System.out.println("from main method");
        demoMethod(); //calling method
    }
}
