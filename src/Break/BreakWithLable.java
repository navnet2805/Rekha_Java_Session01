package Break;

public class BreakWithLable {
    public static void main(String[] args) {

        outer :
        for (int i=1 ; i<=3 ; i++)
        {
            for (int j=1 ; j<=4 ; j++)
            {
                if (j%2==0)
                {
                    break outer;
                }
                System.out.println(j);
            }

        }
    }
}
