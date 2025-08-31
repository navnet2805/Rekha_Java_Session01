package Loops;

public class SumOfDigitsWhileLoop {
    /*
    Sum of digits of a number (while loop)?
    logic:
    1+2+3+4+5 =15
    Explain:
    1. First get only 1 number from the originalnumber.
    2. Once we get this number store it to some variable.
    3. Update the number by removing the fetched number.
    4. Again repeat step number 1.
    5. Add this number to the 1st number and store it to the same variable.
    repeat this steps till the number is Zero
     */

    public static void main(String[] args) {
        int num = 12345; //initialization
        int result = 0;

        while (num>0) //condition
        {//body entering
           result = result + num%10;
           num = num/10; //updation
        }//end of loop body
        System.out.println(result);
    }
}
