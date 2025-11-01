package Abstract;

public abstract class Ab_01 {

    Ab_01() //constructor
    {

    }

    //static member
    static int a = 10;

    final static int c = 40; //final member

    static
    {
        System.out.println("static block");
    }

    public static void m01()
    {
        System.out.println("s method");
    }

    //non static
      int b = 20;

    {
        System.out.println(" non static block");
    }

    public void m02()
    {
        System.out.println("ns method");
    }

    abstract public void m03(); //abstract method

    public static void main(String[] args) {
      //  new Ab_01(); --> Object can not be created , because of abstract method

    }
}
