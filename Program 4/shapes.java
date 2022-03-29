import java.util.*;
abstract class shapes {
    double dim1, dim2,result;

    shapes(double a, double b) {
        dim1 = a;
        dim2 = b;
        result =0;
    }

    abstract double printArea();
    void display()
    {
        double b = dim1;
        System.out.println(b);}
}

    class rectangle extends shapes {
        rectangle(double a, double b) {
            super(a, b);
        }

        @Override
        double printArea() {
            result= dim1 * dim2;
            return result;
        }
    }

    class triangle extends shapes {
        triangle(double a, double b) {
            super(a, b);
        }

        @Override
        double printArea() {
             result=0.5 * dim1 * dim2;
             return result;
        }
    }

    class circle extends shapes {
        circle(double a, double b) {
            super(a, b);
        }

        @Override
        double printArea() {
            result= dim1 * dim2 * dim2;
            return result;
        }
    }
class shapesarea {
    public static void main(String[] args) {
        shapes s1;
        rectangle r =new rectangle(20,30);
        triangle t =new triangle(10,15);
        circle c =new circle(3.14,4);
        s1=r;
        s1.display();
        System.out.println("Area of Rectangle: "+s1.printArea());
        s1=t;
        System.out.println("Area of Triangle: "+s1.printArea());
        s1=c;
        System.out.println("Area of Circle: "+s1.printArea());
    }
}