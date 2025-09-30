package Class_Object_Constructor;

public class mobile1 {
    //features
    int ram, rom, noOfCameras;
    double screensize;


    mobile1(int ram,int rom)
    {

    }

    mobile1()
    {

    }

    public static void main(String[] args) {
        new mobile1(); // object // whenever user creates param constructor then JVM wil not create default constructor
        new mobile1(8,256);
    }
}
