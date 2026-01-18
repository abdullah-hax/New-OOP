//@--------------method overloading-----------------------

package newOOP;

class Calculate{
    int add(int a, int b){
        return a + b;
    } 

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
}

public class CalculateMain{
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        System.out.println(calculate.add(2,4,6));
        System.out.println(calculate.add(4,6));
        System.out.println(calculate.add(5.5,8));
        
    }
}





//@--------------evabe krbena(design nosto hoye jai)-------------------

/* package newOOP;

class Calculate{
    private int a;
    private int b;
    private int c;

    public Calculate(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Calculate(int a, int b){
        this(a, b, 0);
    }

    public Calculate(){
        this(0, 0, 0);
    }
}

public class CalculateMain {
    
} */

/* calculate কাজটার জন্য → method overloading
constructor overloading → object বানানোর জন্য

Constructor = object কীভাবে জন্মাবে
Method = object জন্মের পরে কী করবে 


*constructor overlaoding use krbe esb khettre:
Student
various types of Rectangle
various types of Laptop
BankAccount

*method overlaoding use krbe esb khettre:
calculator e various value die addition/division/substraction/mutiplication*/