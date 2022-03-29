package CIE;

import java.util.Scanner;

public class Internals {
    Scanner Sc = new Scanner(System.in);
    public int intmarks[] = new int[5], inttot =0;


    public void accept_cie()
    {
        System.out.println("Enter The internal marks of 5 students :");
        for (int i=0;i<5;i++)
        {
            intmarks[i] = Sc.nextInt();
            inttot =  inttot + intmarks[i];
        }
    }
}
