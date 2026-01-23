package newOOP;

class Engine{
    private int power;

    Engine(int power){
        this.power = power;
    }

    void start(){
        System.out.println("Engine started with power " + power);
    }
}

class Car{
    private Engine engine;  // Composition

    Car(Engine engine){
        this.engine = engine;   // parameterized composition
    }

    void drive(){
        engine.start();
        System.out.println("Car is driving");
    }
}

public class Composition2 {
    public static void main(String[] args) {
        Engine engine = new Engine(130);  // Engine তৈরি
        Car car = new Car(engine);       // Car-কে Engine দেওয়া

        car.drive();
    }
}

/* 👉 Car Engine-এর মালিক না
   👉 Car Engine ব্যবহারকারী */


/* আগেরটা ছিল:

engine = new Engine();


সমস্যা:

    Engine fixed
    Engine change করতে Car edit করতে হয়

এইটা better কারণ:

    Engine আলাদা বানানো যায়
    Car নিয়ে কোন ঝামেলা নাই
    testing easy

Teacher একে বলে:

Loose coupling */