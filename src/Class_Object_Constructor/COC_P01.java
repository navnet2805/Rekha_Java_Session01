package Class_Object_Constructor;

public class COC_P01 {

    //feature
    int a,b,c;
    double d,e,f;

    COC_P01() //default constructor
    {

    }

    COC_P01(int a) // 1 param constructor
    {

    }

    COC_P01(int a,int b) // 2 param constructor
    {

    }

    public static void main(String[] args) {
        new COC_P01(); //new keyword along with constructor is an object.
        new COC_P01(2);
        new COC_P01(2,3);
    }
}
