package String;

public class replace_01 {
    public static void main(String[] args) {
        String s = "Java programming";
        System.out.println(s.replace("Ja","Pa"));

        System.out.println(s.replaceAll(s,"Python"));

        System.out.println(s.replaceFirst("a","r"));
    }
    }
