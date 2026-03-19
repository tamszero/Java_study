package W7;

import java.util.Scanner;

public class W7_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input radius for a Circle");
        double radius = sc.nextInt();
        Circle cc = new Circle(radius);
        sc.nextLine();

        System.out.println("Input length for a square");
        double side = sc.nextInt();
        Square s = new Square(side);
        sc.nextLine();

        System.out.println("Input a for a triangle");
        double a = sc.nextInt();
        System.out.println("Input b for a triangle");
        double b = sc.nextInt();
        System.out.println("Input c for a triangle");
        double c = sc.nextInt();
        Triangle t = new Triangle(a, b, c);

        System.out.println("<Circle>");
        System.out.println("Area: " + cc.area());
        System.out.println("Circumference: " + cc.perimeter());
        System.out.println("<Square>");
        System.out.println("Area: " + s.area());
        System.out.println("Circumference: " + s.perimeter());
        System.out.println("<Triangle>");
        System.out.println("Area: " + t.area());
        System.out.println("Circumference: " + t.perimeter());



    }
}

class Circle implements Geometry{
    double radius;

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return radius*radius*PI;
    }
    public double perimeter(){
        return radius*2*PI;
    }
}

class Square implements Geometry{
    double side;

    Square(){

    }
    Square(double side){
        this.side = side;
    }

    public double area(){
        return side*side;
    }

    public double perimeter(){
        return 4*side;
    }
}
class Triangle implements Geometry{
    double a, b, c;

    Triangle(){}
    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(){
        double s = (perimeter())/2 ;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));

    }
    public double perimeter(){
        return a+b+c;
    }
}