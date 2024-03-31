package OOPS3.ChainingOFConstructor;

public class Chaining
{
    public Chaining()
    {
        this(20);
        System.out.println("Default constructor...");
    }

    public Chaining(int x)
    {
//		this(10,20);
        System.out.println("Value of x in Parameterized constructor is : "+x);
    }

    public Chaining(int x,int y)
    {
        this();
        System.out.println("value of x :"+x+".value of y : "+y+". sum is : "+(x+y));
    }

    public static void main(String[] args) {
        Chaining constructorchaining=new Chaining(10, 20);
    }
}
