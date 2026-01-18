//@-----------------------Overloading + this()chaining-------------------

/* Golden rule (exam + industry)

এই লাইনটা মনে রাখো:
    One constructor does the real work.
    Other constructors just forward the request.
    এই forwarding-টাই হচ্ছে this() chaining। */

package newOOP;


class Rectangle {
    private double length;
    private double width;

    // Master constructor
    public Rectangle(double length, double width) {

        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        } else {
            this.length = 1;
            this.width = 1;
        }
    }

    // Square constructor
    public Rectangle(double side) {
        this(side, side); // chaining        this() = constructor call 
    }

    // Default constructor
    public Rectangle() {
        this(1, 1); // chaining
    }

    public double area() {
        return length * width;
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(7, 8);
        Rectangle rectangle2 = new Rectangle(10);
        Rectangle rectangle3 = new Rectangle();

        System.out.println("Area of rectangle 1: " + rectangle1.area());
        System.out.println("Area of rectangle 2: " + rectangle2.area());
        System.out.println("Area of rectangle 3: " + rectangle3.area());
    }
}

// --------------Common student mistake------------------

/* class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public Rectangle(double length) {
        this.length = length;
        this.width = length;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
} */

/* ❌ problem:

    - validation 3 জায়গায় লিখতে হচ্ছে
    - logic duplicate
    - validation future এ  change হলে ৩ জায়গায় edit */

/* Golden rule (exam + industry)

এই লাইনটা মনে রাখো:
    One constructor does the real work.
    Other constructors just forward the request.
    এই forwarding-টাই হচ্ছে this() chaining। */