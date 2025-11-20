package Array_01;

public class arr_01 {
    public static void main(String[] args) {
        int a = 10;
        a = 20;
        a = 30;
        a = 40;
        a = 50;
        //System.out.println(a);

        //synatx1:
        int[] a1 = {10,20,30,40,50};
        int a3[] = {10,20,30,40,50};

        //syntax 2:
        int[] a2 = new int[5]; // {0,0,0,0,0}

        //How to read the data from array
        //index=0 amd length= index-1
        System.out.println("a1 Length: " + a1.length); //5
        for (int index=0 ; index< a1.length ; index++)
        {
            System.out.println(a1[index]);
        }
        System.out.println("=================================");
        for (int q :a1)
        {
            System.out.println(q);
        }
        System.out.println("=================================");
        //first element
        System.out.println(a1[0]);
        System.out.println("=================================");
        //last element
        System.out.println(a1[a1.length-1]);


        //How to write the data into array
        System.out.println("=================================");
        int count = 1;
        for (int index=0 ; index<a2.length ; index++) //{1,2,3,4,5}
        {
            a2[index] = count++;
            System.out.println(a2[index]);
        }

        System.out.println("=================================");
        int[] a4 = new int[5];
        int i = 0;
        int c = 10;
        for (int r : a4)
        {
            a4[i++] = c++; //i=0
           // System.out.println(a4[--i]); //i=1-1=0

        }
        for (int r : a4)
        {
            System.out.println(r);
        }


    }
}
