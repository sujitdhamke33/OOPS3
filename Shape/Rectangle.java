package OOPS3.Shape;

import java.util.Scanner;

public class Rectangle implements Shape
{
    static Scanner sc=new Scanner(System.in);
    double length;
    double breadth;

    public static void main(String[] args)
    {
        Rectangle rectangle=new Rectangle();
        rectangle.input();
        System.out.println("Area of Rectangle is : "+rectangle.area());

    }

    @Override
    public void input()
    {
        System.out.println("Enter the length of rectangle : ");
        double length=sc.nextDouble();
        System.out.println("Enter the Breadth of rectangle : ");
        double breadth=sc.nextDouble();
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}
