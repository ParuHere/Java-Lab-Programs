import java.util.*;
import java.lang.Math.*;
public class Program1 {
    Scanner Sc = new Scanner(System.in);
    void Accal()
    {
        int a,b,c;
        System.out.println("Enter The value Of A : ");
        a = Sc.nextInt();
        System.out.println("Enter The value Of B : ");
        b = Sc.nextInt();
        System.out.println("Enter The value Of C : ");
        c = Sc.nextInt();
        //b2-4ac
        double d = (b*b)-(4*a*c);


        if(d < 0 )
        {
            System.out.println("There are no real solutions");
        }
        else
        {
            double q = Math.sqrt(d);
            double x1,x2;
            //x = (-b ± √ (b² - 4ac) )/2a.
            x1 = ((-b) + (q))/(2*a);
            x2 = ((-b) - (q))/(2*a);
            System.out.println("The equation has two real and distinct roots");
            System.out.println("The two Roots are "+x1+" and "+x2);
        }

    }
    public static void main(String[] args) {

        Program1 q1 = new Program1();
        q1.Accal();

    }
}
