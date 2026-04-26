package newOOP;

class Vehicle {
    private int speed;

    public Vehicle(int speed){
        this.speed = speed;
    }

    public int getSpeed(){

        if(speed > 200){
            return 200;  // safety cap 
        }
        return speed;
    }

    public void move(){
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle{

    // baper full ongso ekn Car er vetor ache. super(speed) use krle , speed baper ei ongse cole asbe.
    private String brand;

    public Car(int speed, String brand){
        super(speed); 
        this.brand = brand;
    }

    public void honk(){
        System.out.println("Car is honking");
    }

    @Override
    public void move(){
        System.out.println("Car is moving at speed " + getSpeed());
    }
}

public class Inheritance {
    public static void main(String[] args) {
       
        Vehicle vehicle = new Vehicle(90);
        System.out.println("About Vehicle-------------");
        System.out.println("Speed: " + vehicle.getSpeed());
        vehicle.move();
        
        
        Car car = new Car(520, "Prado");
        System.out.println("\nAbout Car-------------");
        // System.out.println("Brand: " + car.brand);
        System.out.println("Speed: " + car.getSpeed());
        car.move();
        car.honk();

        System.out.println("\nAbout Vehicle-------------");
        vehicle.move();
    }
}


/*       this() = nij classer  constructor call
         super() = paranter constructor call
Object obj = new Object(); => 
        ?new Object() = mention kora objecter constructor call */

/* Inheritance মানে: “A is a B” বলা যায় কি না

    যদি বলা যায় → inheritance
    না গেলে → inheritance না

১️⃣ Real-life intuition (খুব দরকার)

এইগুলো পড়ো, মনে মনে “is-a” বসাও:

    Car is a Vehicle ✅
    Student is a Person ✅
    Rectangle is a Shape ✅

কিন্তু—

    Engine is a Car ❌
    Account is a Bank ❌
    Wheel is a Car ❌

এগুলো has-a, inheritance না। */


/* 🔥 Big OOP principle (remember this)

Fields = private
Methods = public 

Always keep fields(data/variable) private, expose behavior(method) */