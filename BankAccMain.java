/*  account number (private, jate keo change krte na pare)
    balance (private, jate keo change krte na pare)
    deposit(amount)
    withdraw(amount)
    printStatment() */

/*  Critical Design Question

    Validation কোথায় হবে?
    - constructor এ?
    - setter এ?
    - method এ?

    উত্তর:
    balance validation → constructor + setter
    transaction rule → deposit/withdraw */

/*  Industry Insight:
    If a field can break the system, it must never be public. */

/* | Real Life       | OOP          |
| --------------- | ------------ |
| Account opening | Constructor  |  // cashier er kache etar access thakbena , ar thakleo cashier jdi constructor die balance change kre tahle notun ekta object create hoi jabe, history theke jabe tai cashier kkno eta krbena. but setter thakle cashier easily eta krte parto.
| Cash deposit    | deposit()    |
| Cash withdrawal | withdraw()   |
| Balance check   | getBalance() |
 */


package newOOP;

class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        if(balance >= 0){
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid balance! Setting balance to 0");
        }
    }

    public double getBalance(){
        return balance;
    }

    public double deposit(double amount){

        if(amount > 0){
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
        return balance;
    }

    public double withdraw(double amount){

        if(amount > 0 && amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal!");
        }
        return balance;
    }

    public void printStatment(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccMain {
    public static void main(String[] args) {

        //@ constructor এর কাজ হল object create করা 
        BankAccount account1 = new BankAccount("12458907", 12500);  // constructor called, then construcor will create object

        account1.printStatment();

        account1.deposit(5000);
        account1.withdraw(3000);
        account1.withdraw(22000); // Invalid withdrawal

        account1.printStatment();

        account1.deposit(0);
        account1.withdraw(0);
    }
}


