package OOPS.Inheritence.SingleLevel;

public class SLI_P01 {
/*
from parent static block
from child static block
from parent non static block
from parent 1 param constructor
from parent constructor
from child 1 param constructor
from child constructor
form child non static method
form parent static method
60
form child static method
30
form parent static method

 */
    SLI_P01()
    {
        this(3); //constructor chaining
        System.out.println("from parent constructor");
    }

    SLI_P01(int a)
    {
        System.out.println("from parent 1 param constructor");
    }
    //attributes
    int a = 10; //non static

    static int b = 30; //static

    {
        System.out.println("from parent non static block");
    }

    static
    {
        System.out.println("from parent static block");
    }


    public static void m_s_parent()
    {
        System.out.println("form parent static method");
    }

    public void m_ns_parent()
    {
        System.out.println("form parent static method");
    }

}
