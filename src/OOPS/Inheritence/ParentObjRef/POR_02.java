package OOPS.Inheritence.ParentObjRef;

public class POR_02 extends POR_01 {

    public void m01()
    {
        System.out.println("from child m01");
    }

    public void m02()
    {
        System.out.println("method only for child");
    }

    public static void main(String[] args) {
        POR_01 obj =new POR_02(); //child obj || reference type is Parent
        obj.m01();
        obj.m03();
        //obj.m02();

        POR_02 obj1 =new POR_02(); //child obj || reference type is Child
        obj1.m01();
        obj1.m03();
        obj1.m02();
    }
}
