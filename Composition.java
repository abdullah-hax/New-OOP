package newOOP;

class Engine{
    void start(){
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine; // has a

    // constructor use na kore direct Engine engine = new Engine(); leka jai. but constructor use krle onk benefit ache.
    // object creation control e thake , future e parameter deya jai, design clean thake.
    public Car(){
        engine = new Engine();
    }

    void drive(){
        engine.start();
        System.out.println("Car is driving");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car car = new Car();  // Car object create krle automatic Engine object create hoye jabe.
        car.drive();
        // engine.start();  // eta Car classer vetor engine referrence na, ei referrenceta (asole referrence o na) just ekn bananu hoise, eta kono objectke point krtese na.(kintu Car classer ontrvukto engine referrence Engine objectk point krtesilo)
    }

} 

//------------------------------------------------------------------

// 👉 এখানে Car Engine-এর মালিক 

/* ৭️⃣ Golden rule (এইটা লিখে রাখো)

    If you can replace “is a” with “uses a/ has a”,
    then inheritance is wrong.

এই rule মানলে:

    UML diagram
    design question
    coding
সব জায়গায় safe। */

/* ১️⃣ এক লাইনের পার্থক্য (এইটা আগে বসাও)

    is-a → inheritance (extends)
    has-a → composition (object as field)

আরও পরিষ্কার করে:

    is-a = “এই object কি ওইটার একটা বিশেষ রূপ?”
    has-a = “এই object কি ওইটাকে ব্যবহার করে?”  // has a/ uses a

২️⃣ is-a (Inheritance) — কখন ব্যবহার করবে

✅ Valid is-a examples

    Car is a Vehicle
    Student is a Person
    Rectangle is a Shape
    Teacher is a Employee

এগুলোতে একটা common ব্যাপার আছে:

    child = parent-এর specialized version
    child চাইলে parent-এর behavior override করতে পারে 

    
৩️⃣ has-a (Composition) — সবচেয়ে বেশি ভুল হয় এখানে

✅ Valid has-a examples

    Car has an Engine
    Student has a Address
    BankAccount has a Customer
    Laptop has a Battery

এখানে লক্ষ্য করো:

    Engine কখনো Car হয় না
    Address কখনো Student হয় না

👉 তাই inheritance হলে ভুল।*/