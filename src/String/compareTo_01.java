package String;

public class compareTo_01 {
    public static void main(String[] args) {
        String s = "Java "; //{'J','a','v','a'}

        System.out.println(s.compareTo("Java"));

        System.out.println(s.compareTo("java"));

        System.out.println(s.compareToIgnoreCase("java"));
    }
}
