package OOPS.Polymorphism.MethodOverriding;

public class M0_02 extends MO_01{

    public void m01()
    {
        System.out.println("from child m01");
    }

    public static void main(String[] args) {
        M0_02 obj =new M0_02();
        obj.m01();
    }
}
