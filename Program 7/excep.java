
import java.util.*;


public class excep {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int fa,sa;
        System.out.println("Enter Father's Age");
        fa = Sc.nextInt();
        System.out.println("Enter Son's Age");
        sa = Sc.nextInt();
        new Son(fa,sa);

    }
}

