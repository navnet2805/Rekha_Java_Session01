package Encapsulation;

public class Encaps_01 {

    private  int balance = 100;

     int b = 20;

    public void xyz()
    {
        /*
        debitcard -> number are unique
        pin -> for a single person
        pin will be mapped with debitcard.
        if(pin --> debit)
         */
        System.out.println(balance);
    }


    public void seta(int u)
    {
        this.balance = this.balance - u;

    }

    public void withdraw(int amount)
    {
        System.out.println("Withdrawing 20rs");
        seta(amount);
    }


    public static void main(String[] args) {

    }
}
