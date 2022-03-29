import SEE.*;
import CIE.*;
import java.util.*;

public class Compute {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Students :");
        n = Sc.nextInt();
        Internals i1[] = new Internals[n];
        External e1[] = new External[n];

        for (int i=0;i<n;i++)
        {
            i1[i] = new Internals();
            e1[i] = new External();
            e1[i].accept();
            i1[i].accept_cie();
            e1[i].accept_see();
            int grandtot = i1[i].inttot + e1[i].set;
            e1[i].display();
            System.out.println("CIE marks :"+i1[i].inttot);
            System.out.println("SEE marks :"+e1[i].set);
            System.out.println("Final marks :"+grandtot);
            System.out.println();
            System.out.println();
        }

    }
}
