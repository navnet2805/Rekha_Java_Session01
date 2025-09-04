package Variable;

public class P01 {

    static int i = 10; //global variable / instance variable / static variable

    static
    {
        System.out.println(i);
    }

    public static void main(String[] args) {

        int j=20; // j is a local variable
        System.out.println(j);
        System.out.println(i);

    }
}
