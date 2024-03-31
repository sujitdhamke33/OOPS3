package OOPS3.Swap;

public class Main {
    public static void main(String[] args)
    {
        Employee e1=new Employee(1, "David", 10000);
        Employee e2=new Employee(2, "Alex", 20000);

        System.out.println("Before Swapping Values are :\n");
        e1.display();
        e2.display();

        e1.swap(e1, e2);

        System.out.println("\nAfter Wapping Values are : \n");
        e1.display();
        e2.display();

    }
}
