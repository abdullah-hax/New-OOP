package newOOP;

abstract class Animal{
    void walk(){
        System.out.println("This animals walk");
    }

    abstract void sound();

    void eat(){
        System.out.println("This Animals eat");
    }
}

class Cat extends Animal{

//      abstract class Animal{
//         void walk(){
//             System.out.println("This animals walk");
//         }

//         abstract void sound();

//         void eat(){
//             System.out.println("This Animals eat");
//         }
//     }


    @Override
    void sound(){
        System.out.println("Cat mewos");
    }

    @Override
    void eat(){
        System.out.println("Cat eats fish");
    }

    void climbing(){     // Cat's specific method is not allowed by animal referrence
        System.out.println("Cat can climb tree");
    }
}

class Cow extends Animal{

// ANIMAL SECTION
//      abstract class Animal{
//         void walk(){
//             System.out.println("This animals walk");
//         }

//         abstract void sound();

//         void eat(){
//             System.out.println("This Animals eat");
//         }
//     }


// COW SECTION------
// // at run time jvm checks cow object. cow has eat & sound method.  
    @Override
    void sound(){
        System.out.println("Cow moos");
    }

    @Override
    void eat(){
        System.out.println("Cow eats grass");
    }


// at compile time compiler checks animal referrence. but animal has not climbing method but has sound & eat method. so climbing method will be canceled at compile time.
    void climbing(){    // Cow's specific method is not allowed by animal referrence
        System.out.println("Cow cann't climb tree");
    }
}

class Dog extends Animal{

//      abstract class Animal{
//         void walk(){
//             System.out.println("This animals walk");
//         }

//         abstract void sound();

//         void eat(){
//             System.out.println("This Animals eat");
//         }
//     }


    @Override
    void sound(){
        System.out.println("Dog barks");
    }

    @Override
    void eat(){
        System.out.println("Dog eats bones");
    }

    void climbing(){       // Dog's specific method is not allowed by animal referrence
        System.out.println("Dog cann't climb tree");
    }
}

public class AbsRefference{

    public static void main(String[] args) {
        Cow cow = new Cow();
        Cat cat = new Cat();
        Dog dog = new Dog();
       
        Animal animal = new Cow();
        Animal animal2 = new Cat();


        animal.walk();
        animal.sound();
        animal.eat();
    }
}
