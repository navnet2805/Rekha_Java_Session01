package String;

public class indexOf_01 {
    public static void main(String[] args) {
        String s = "aJava"; //{'a','J','a','v','a'}
        System.out.println(s.indexOf('a'));

        System.out.println(s.lastIndexOf('a'));

        //index will always starts from 0
        //if index is -1 then the character doesnt exist
    }
}
