package AccessModifier.Package1;

import static AccessModifier.Package1.PublicClass.*;

public class AnotherClass {
    public static void main(String[] args) {
        publicmethod();
        defaultmethod();
        //privatemethod(); - it has private access.
    }
}
