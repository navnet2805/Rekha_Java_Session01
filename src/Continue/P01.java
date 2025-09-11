package Continue;

public class P01 {
    //Write a program to print even numbers from 1 to 20. whenever the value is greater than 6 and less than 11 then do not print the value.

    /*
    range: 1 to 20
    condition : even number
    condtion : num>6 && num<9 ---> action: do not print
     */

    public static void main(String[] args) {
        //Logic 2
        for (int i = 2 ; i<=20 ; i+=2)
        {
            if (i>6 && i<11)
               {
                   continue; //8 and 10 skipped
               }
               System.out.println(i);
        }






        //Logic 1
//        for (int i = 1 ; i<=20 ; i++)
//        {
//           if (i%2==0)
//           {//even numbers
//               if (i>6 && i<11)
//               {
//                   continue; //8 and 10 skipped
//               }
//               System.out.println(i);
//           }
//        }
    }
}
