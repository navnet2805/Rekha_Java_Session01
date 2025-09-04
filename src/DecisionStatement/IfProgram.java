package DecisionStatement;

public class IfProgram {
    public static void main(String[] args) {

        // print the even numbers from the range 1 to 20;

        for (int n=1 ; n<=20 ; n=n+1)
        {
            if (n%2==0) //divisible by 2 -- this is even number
            {
                System.out.println(n);
            }
        }
    }
}
