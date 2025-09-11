package Continue;

public class continuewithoutLabel {
    public static void main(String[] args) {
        //Write a program to print from 1 to 20. whenever the value is divisible by 11 then do not print the value.

        for (int i=1 ; i<=20 ; i++)
        {
            if (i%11==0)
            {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("end of for loop block");

    }
}
