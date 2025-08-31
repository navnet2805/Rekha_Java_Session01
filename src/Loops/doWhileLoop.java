package Loops;

public class doWhileLoop {
    public static void main(String[] args) {
        //write a program to print the number from 1 to 10;
        /*
         rep action: print statement
         initialization : from where to start : 1
         condition: when to terminate : till 10 | i<=10 | i<11
         updation : +1
         */

        int i=1;
        do {
            System.out.println(i);
            i=i+1;
        }while (i>=10);
        System.out.println("end of do while");
    }
}
