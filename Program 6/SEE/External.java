package SEE;
import CIE.*;
import java.util.*;

public class External extends Student {
    public int tot,set = 0;
    Scanner Sc = new Scanner(System.in);
    public int seemarks[] = new int[5];

    public void accept_see()
    {
        System.out.println("Enter The SEE marks of 5 courses :");
        System.out.println();
        for (int i=0;i<5;i++)
        {
            seemarks[i] = Sc.nextInt();
            set = set + seemarks[i];
        }

    }
}
