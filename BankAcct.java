package OOPS3;

public class BankAcct {
    private double balance; // balance in the bank account

    public BankAcct(double balance) {
        this.balance = balance;
    }

    public class Interest {
        private double interestRate; // annual interest rate

        public Interest(double interestRate) {
            this.interestRate = interestRate;
        }

        public double calculateInterest() {
            return balance * interestRate / 100;
        }
    }

    public static void main(String[] args) {
        BankAcct myAccount = new BankAcct(10000); // create a bank account with balance 10000
        BankAcct.Interest myInterest = myAccount.new Interest(3.5); // create an Interest object with annual interest rate 3.5%

        double interest = myInterest.calculateInterest(); // calculate the interest
        System.out.println("The interest is " + interest);
    }
}

