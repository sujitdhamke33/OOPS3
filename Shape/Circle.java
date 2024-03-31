package OOPS3.Shape;

import java.util.Scanner;

public class Circle implements Shape
{
    static Scanner sc=new Scanner(System.in);
    double radius;
    public static void main(String[] args)
    {
        Circle circle=new Circle();
        circle.input();
        System.out.println("Area of Circle is : "+circle.area());
    }
    @Override
    public void input()
    {
        System.out.println("Enter the radius : ");
        double radius=sc.nextDouble();
        this.radius=radius;
    }
    @Override
    public double area()
    {
        return 3.14* radius * radius;
    }
}