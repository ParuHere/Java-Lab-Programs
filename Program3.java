import java.util.*;
class Program3 {
    Scanner Sc = new Scanner(System.in);
    String name;
    String author;
    int price;
    int num_pages;

    Program3(String n, String a, int p, int num_p) {
        name = n;
        author = a;
        price = p;
        num_pages = num_p;
    }

    public String toString() {
        return name + " " + author + " " + price + " " + num_pages;
    }

    public static void main (String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Number Of Books");
        int n= Sc.nextInt();

        Program3 b1[] = new Program3[n];
        for (int i=0;i<n;i++)
        {
            b1[i]= new Program3("dfd","dff",34,344);
            System.out.println("Enter Book Name");
            String name = Sc.nextLine();
            System.out.println("Enter Book Author");
            String author = Sc.nextLine();
            System.out.println("Enter Book Price");
            int price = Sc.nextInt();
            System.out.println("Enter Number of Pages in book");
            int num_pages = Sc.nextInt();
            b1[i] = new Program3(name,author,price,num_pages);
            System.out.println(b1[i]);

        }

    }
}