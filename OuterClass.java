package OOPS3;

class Outer {
    static class Inner {
        void show() {
            System.out.println("This is from inner class.");
        }
    }
}

public class OuterClass {
    public static void main(String[] args) {
        Outer.Inner innerObj = new Outer.Inner();

        innerObj.show();

        Outer outerObj = new Outer();
        Outer.Inner innerObj2 = new Outer.Inner();
        innerObj2.show();
    }
}

