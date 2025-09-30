package Class_Object_Constructor;

public class mobile2 {
    //features
    int ram, rom, noOfCameras;
    double screensize;
    boolean isAIfeatureenabled;

    mobile2(int ram,int rom,double screensize,int noOfCameras)
    {
        this.ram = ram;
        this.rom = rom;
        this.noOfCameras = noOfCameras;
        this.screensize = screensize;
    }

    mobile2(int ram,int rom,double screensize,int noOfCameras, boolean isAIfeatureenabled)
    {
        this.ram = ram;
        this.rom = rom;
        this.noOfCameras = noOfCameras;
        this.screensize = screensize;
        this.isAIfeatureenabled=isAIfeatureenabled;
    }

    public static void main(String[] args) {
// We are creating multiple objects for each features
      /* new mobile2().ram = 12;  //1 object is created and ram value is asisgned.
        new mobile2().rom = 256; //1 more objected is created and rom value is asisgned.
        new mobile2().noOfCameras=3;
        new mobile2().screensize=6.3;
         */

        //1st object is created and then we are assiging the features which is not expected.
        /*
        mobile2 samsungS25 =new mobile2();
        samsungS25.ram=8;
        samsungS25.rom=256;
        samsungS25.screensize=6.5;
        samsungS25.noOfCameras=3;
         */

        mobile2 samsungS25 =new mobile2(8,256,6.5,3);

        mobile2 samsungS24 =new mobile2(1,1,1.1,1);
        System.out.println(samsungS24.ram);
        System.out.println(samsungS25.ram);

        mobile2 samsunggalaxyAI =new mobile2(1,1,1.1,1, true);
        System.out.println("is AI feautre enabled in samsunggalaxyAI? " +samsunggalaxyAI.isAIfeatureenabled);





    }
}
