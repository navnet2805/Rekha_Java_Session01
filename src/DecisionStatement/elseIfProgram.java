package DecisionStatement;

public class elseIfProgram {
    public static void main(String[] args) {

        for (int i=1 ; i<=20 ; i++)
        {
            if (i%2==0)
            {
                System.out.println("*");
            }
            else if (i%3==0)
            {
                System.out.println("&");
            }
            else if(i%4==0)
            {
                System.out.println("%");
            }
            else if(i%5==0)
            {
                System.out.println("@");
            }
            else {
                System.out.println(i + " number is not divisible by 2,3,4 and 5");
            }
        }
    }
}
