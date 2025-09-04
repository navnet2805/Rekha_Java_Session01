package Loops;

public class Multiple_3_UsingFormat {
    public static void main(String[] args) {
        /*
        3*1=3
        3*2=6
        3*3=9
        ....
        3*10=30;
         */
        int n1 =3;

        for (int n2 =1;  n2<=10 ; n2 = n2 + 1)
        {
            int n3=(n1*n2);
            System.out.println(n1+ "X" +n2+"=" +n3);
        }
    }
}
