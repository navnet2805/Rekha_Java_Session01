package ClassLoadingProcess;

public class CLP_01 {

    CLP_01()
    {
        System.out.println("From default const");
    }
    //members: variable , methods and blocks

    //Static members:

    //Static variable
    static int a = 10;

    //Static method
    public static void smethod()
    {
        System.out.println("from static method");
    }

    //static block
    static
    {
        System.out.println("from static block");
    }

    //Non static members
    //Non Static variable
     int b = 20;

    //Non Static method
    public void nsmethod()
    {
        System.out.println("from non static method");
    }

    //non static block
    {
        System.out.println("from non static block");
    }

    public static void main(String[] args) {
        System.out.println(a); //10
        CLP_01 obj = new CLP_01();
        System.out.println(obj.b); // 20
        CLP_01 obj1 = new CLP_01();
        obj1.b = 30;
        a = 50;
        System.out.println(obj1.b); // 30
        System.out.println(obj.b); // 20

        System.out.println(obj.a); //10
        System.out.println(obj1.a); //50
        System.out.println(a); // 50
        System.out.println(CLP_01.a); //10 or //50

        obj1.a=100;
        System.out.println(obj1.a);
        System.out.println(obj.a);


    }

}
