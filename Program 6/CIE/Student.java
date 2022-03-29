package CIE;
import java.util.*;
public class Student {
    Scanner Sc = new Scanner(System.in);
    public String usn;
    public String name;
    public int sem;

    public void accept(){
        System.out.println("Enter USN :");
        usn = Sc.nextLine();
        System.out.println("Enter Name :");
        name = Sc.nextLine();
        System.out.println("Enter SEM :");
        sem = Sc.nextInt();
    }
    public void display(){
        System.out.println("USN : "+usn);
        System.out.println("Name : "+name);
        System.out.println("Sem : "+sem);
    }
}
