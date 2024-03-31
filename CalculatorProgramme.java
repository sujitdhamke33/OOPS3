package OOPS3;
abstract class Calculator {
     abstract double add(double num1, double num2);
     abstract double subtract(double num1, double num2);
     abstract double multiply(double num1, double num2);
     abstract double divide(double num1, double num2);
}

class BasicCalculator extends Calculator {
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
        }
        return num1 / num2;
    }
}

public class CalculatorProgramme {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        double resultAdd = calculator.add(10, 5);
        double resultSubtract = calculator.subtract(10, 5);
        double resultMultiply = calculator.multiply(10, 5);
        double resultDivide = calculator.divide(10, 5);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
    }
}

