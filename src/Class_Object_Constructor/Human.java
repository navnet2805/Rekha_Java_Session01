package Class_Object_Constructor;

public class Human {

    Human()
    {
        System.out.println("from default const");
    }


    //features
    int noOfHands;
    int noOfNose;
    int noOfLegs;

    Human(int noOfHands,int noOfNose, int noOfLegs)
    {
        this.noOfHands = noOfHands;
        this.noOfNose= noOfNose;
        this.noOfLegs = noOfLegs;
    }

    //Actions --- methods
    public static void walk()
    {
        System.out.println("Walking");
    }

    public static void run()
    {
        System.out.println("Running");
    }

    public static void main(String[] args) {
//        new Human().noOfHands = 2;
//        new Human().noOfLegs = 2;

      Human obj = new Human();
      obj.noOfLegs = 2;
      obj.noOfNose = 1;
      obj.noOfHands = 2;

      Human obj1 = new Human(2,1,2);
        System.out.println(obj1.noOfHands);
        System.out.println(obj1.noOfNose);
        System.out.println(obj1.noOfLegs);

    }


}
