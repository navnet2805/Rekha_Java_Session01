package String;

public class String_02 {

    public static void main(String[] args) {

        //Syntax 1
        String s = "Java";

        //Syntax 2
        String s1 = new String("Program");

        String s2 = "Program";

        String s3 = "program";

        String s4 = "Program";

        //== --> reference type, which area?
        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s2==s4);
        System.out.println(s3==s1);
        System.out.println(s3==s2);

        //equals() --> contents
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s4));
        System.out.println(s3.equals(s1));
        System.out.println(s3.equals(s2));
    }
}
