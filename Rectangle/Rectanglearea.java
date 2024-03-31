package OOPS3.Rectangle;

import java.util.Scanner;

public class Rectanglearea {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length : ");
        double length=sc.nextDouble();
        System.out.println("Enter the breadth : ");
        double breadth=sc.nextDouble();

        AreaOfRectangle(length,breadth);
    }

    public static void AreaOfRectangle(double length,double breadth)
    {
        double area=length * breadth;
        System.out.println("Area of Rectangle is : "+area);
    }
}