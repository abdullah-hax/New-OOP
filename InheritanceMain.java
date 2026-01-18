package newOOP;

class Vehicle {
    protected int speed;

    public Vehicle(int speed){
        this.speed = speed;
    }

    public void move(){
        System.out.println("vehicle is moving");
    }
}

public class InheritanceMain {
    public static void main(String[] args) {
        
    }
}


/* //   ?this() = nijer objecter constructor call
        ?super() = paranter objecter constructor call
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