package String;

public class starts_ends {
    public static void main(String[] args) {
        String s = "Java"; //{'J','a','v','a'}

        System.out.println(s.startsWith("J")); //true

        System.out.println(s.startsWith("a")); //false

        System.out.println(s.endsWith("a")); //true

        System.out.println(s.endsWith("J"));//false
    }

}
