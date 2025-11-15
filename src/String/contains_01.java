package String;

public class contains_01 {
    public static void main(String[] args) {
        String s = "Java "; //{'J','a','v','a'}

        System.out.println(s.contains("a"));

        System.out.println(s.contains("j")); //false

        System.out.println(s.contains("av"));//true

        System.out.println(s.contains("aJ")); //false
    }
}
