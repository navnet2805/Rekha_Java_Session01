package DecisionStatement;

public class SwitchSyntax2 {
    public static void main(String[] args) {

          int num     =  1    ;
        //DT variable = value ;
        // -> it is same as : and break

      String valuevariable = switch (num)
        {
            case 0 ->"value is 0";
            case 1 ->"value is 1";
            case 2 ->"value is 2";
            case 3 ->"value is 3";
            case 4 -> "value is 4";
            default ->"none of the conditions are matched.";
        };


        System.out.println(valuevariable);
    }
}
