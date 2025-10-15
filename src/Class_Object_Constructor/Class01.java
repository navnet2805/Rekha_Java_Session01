package Class_Object_Constructor;

public class Class01 {

    Class01()
    {
        this(5);
        System.out.println("from default const");
    }

    Class01(int a)
    {
        this('h');
        System.out.println("from 1 param int const");
    }

    Class01(char c)
    {
        this(5,6);
        System.out.println("from 1 param char const");
    }

    Class01(int a , int b)
    {
        System.out.println("from 2 param const");
    }

    public static void main(String[] args) {
        new Class01();
        new Class01(2,3);
    }
}
