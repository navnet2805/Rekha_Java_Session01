package DecisionStatement;

public class SwitchSyntax1 {

    public static void main(String[] args) {

        int num = 5;

        switch (num)
        {
            case 0 :
                System.out.println("value is 0");
                break;
            case 1 :
                System.out.println("value is 1");
                break;
            case 2 :
                System.out.println("value is 2");
                break;
            case 3 :
                System.out.println("value is 3");
            case 4 :
                System.out.println("value is 4");
                break;
            default:
                System.out.println("none of the conditions are matched.");
        }
    }
}
