package AccessModifier.Package2;

import static AccessModifier.Package1.PublicClass.*;

public class AnotherClassFromDifferentPackage {

    public static void main(String[] args) {
        publicmethod();
        //defaultmethod(); - can not be used in different package.
       // privatemethod();// - it has private access.
    }
}
