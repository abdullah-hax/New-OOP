
/* ৮️⃣ ৩টা golden rule (মাথায় রাখো)

    Inheritance লাগবে
    Method overriding লাগবে
    Parent reference → child object লাগবে
    এই ৩টা না থাকলে polymorphism নাই। 

Inheritance + overriding + parent reference — এটাই polymorphism */


package newOOP;


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

public class Polymorphism {
    
    // 👉 একটাই method
    static void makeSound(Animal a) {
        a.sound();
    }

    public static void main(String[] args) {

        makeSound(new Cat());
        makeSound(new Cow());
        makeSound(new Dog());
    }
}

/*  Animal a = new Cat();  // ভিতরে ভিতরে এটাই হচ্ছে
    Animal a = new Cow(); 
    Animal a = new Dog();  */

/* a হলো:
    compile time-এ → Animal
    runtime-এ → কখনো Cow, কখনো Cat, কখনো Dog */


/* //! parant reference use na korar osubida(reference 3 bar likte hocce, future e aro animal add krle bar bar reference likte hobe )

class Test {

    static void makeSound(Dog d) {
        d.sound();
    }

    static void makeSound(Cat c) {
        c.sound();
    }

    static void makeSound(Cow c) {
        c.sound();
    }

    public static void main(String[] args) {

        makeSound(new Dog());
        makeSound(new Cat());
        makeSound(new Cow());
    }
} */
