package OOPS3.Cuboid;

import java.util.Scanner;

public class Cuboid {
    static double length,breadth,height;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        Cuboid main=new Cuboid();
        double result=main.volumeCuboid();
        System.out.println("Volume of Cuboid We calculate is : "+result);
    }

    public double volumeCuboid()
    {
        System.out.println("Enter the length of cuboid : ");
        double length=sc.nextDouble();
        System.out.println("Enter the breadth of cuboid : ");
        double breadth=sc.nextDouble();
        System.out.println("Enter the height of cuboid : ");
        double height=sc.nextDouble();

        return length * breadth *height;
    }

}