package Loops;

public class forloop {
    public static void main(String[] args) {
        //write a program to print the number from 1 to 10;
        /*
         rep action: print statement
         initialization : from where to start : 1
         condition: when to terminate : till 10 | i<=10 | i<11
         updation : +1
         */

        for (int i=1 ; i>=10 ; i=i+1)
        {
            System.out.println(i);
        }
        System.out.println("for loop condition failed , so i am printed");

    }
}
