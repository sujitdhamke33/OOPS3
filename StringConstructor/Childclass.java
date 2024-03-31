package OOPS3.StringConstructor;

public class Childclass extends Parentclass
{
    String childmessage;
    public Childclass(String childmessage,String supermessage)
    {
        super(supermessage);
        this.childmessage=childmessage;
    }

    public void display()
    {
        System.out.println("Message from parent is : "+supermessage);
        System.out.println("Message from child is : "+childmessage);
    }
}
