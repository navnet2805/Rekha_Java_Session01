package OOPS.Inheritence.SingleLevel;

public class SLI_C01 extends SLI_P01 {
    SLI_C01()
    {
       this(3);//constructor chaining
        System.out.println("from child constructor");
    }

    SLI_C01(int a)
    {
        //jvm will define super()
        System.out.println("from child 1 param constructor");
    }

    int a = 100; //from child
    int c = 40; //non static

    static int d = 60; //static

    {
        System.out.println("from child non static block");
    }

    static
    {
        System.out.println("from child static block");
    }


    public static void m_s_child()
    {
        System.out.println("form child static method");
    }

    public void m_ns_child()
    {
        System.out.println("form child non static method");
    }

    public static void main(String[] args) {
        SLI_C01 obj = new SLI_C01();
        obj.m_ns_child();
        obj.m_ns_parent();


        //static
        System.out.println(d);
        m_s_child();

        //static from parent
        System.out.println(b);
        m_s_parent();




    }
}
