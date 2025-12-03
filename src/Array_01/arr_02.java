package Array_01;

public class arr_02 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);
        a = 30;
        System.out.println(a);

        //1D array
        int[] a1 = {10,20,30};

        //syntax 2-> where we are not aware of data/element
        int[] a2 = new int[3]; // {0,0,0}

        System.out.println("==============================");
        //default value of int[] --> 0

        //to read the specific data from the array
        System.out.println(a1[2]);

        //1st element of a1 array
        System.out.println(a1[0]);

        //last element
        System.out.println(a1[a1.length-1]);

        //how to read all the data/elements from an array
        int[] d = {10,20,30,40};

        //2 approach: for loop || for each loop
        System.out.println("==============================");

        //1st approach : simple for loop using index for d array
        for (int index=0 ; index<d.length ; index++)
        {
            System.out.println(d[index]);
        }

        System.out.println("==============================");
        //2nd approach: for each loop -->
        for (int a4 : d)
        {
            System.out.println(a4);
        }


        //how to write the data into an array
        //2 approach: for loop || for each loop
        System.out.println("==============================");
        int[] n = new int[3];
        //1st approach
         int u = 19;
        for (int i=0; i<n.length ; i++) //{10,10,10}
        {
            n[i] = u++;
            System.out.println(n[i]);
        }

        System.out.println("==============================");

        //2nd approach
        int[] j = new int[7];
        int h=0; //index
        int k = 0;
        for (int y : j)
        {
            k = k + 10;
            j[h++] = k; //h=0 --> j[0]
            //h=1
            System.out.println(j[--h]); //h=1-1=0 --> j[0]
        }


    }
}
