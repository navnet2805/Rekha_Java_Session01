package Interface_;

public interface IF_00 {

    /*
    IF_00()
    {

    }
    Constructors are not allowed in interface
     */

    int a = 10; //static and final

    //method
    void m03(); //abstract method //access modifier for abstract method is always public

 abstract void m04(); //abstract method //access modifier for abstract method is always public

    default void m05()
    {
        System.out.println("from m05");
    }

    static void m06()
    {

    }


    public static void main(String[] args) {
       // new IF_00();
        IF_00 ifobj;
    }
}
