
// Abstraction মানে কী? (এক লাইনে)
// What to do জানানো, how to do লুকানো

package newOOP;

abstract class Animal {

    void walk() {
        System.out.println("Animal walks");   // সব animal হাঁটে, কিন্তু sound আলাদা
    }

    abstract void sound();  // what they do : sound kore
                            // how they do : bole deya nai
   
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

class Cow extends Animal{
    @Override
    void sound(){
        System.out.println("Cow moos");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal2 = new Cow();
        Animal animal3 = new Dog();

        animal.sound();
        animal2.sound();
        animal3.sound();
    }
}


/* Abstraction মানে কী? (এক লাইনে)

    What to do জানানো, how to do লুকানো

আর Java-তে সেটা করা হয়:

    abstract class
    abstract method

১️⃣ কেন abstraction দরকার হলো?

আগের polymorphism-এ আমরা এটা করেছিলাম:

    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

সমস্যা কী?

    👉 “Animal makes a sound” — এটা vague
    👉 প্রতিটা animal-এর sound আলাদা
    👉 Parent-এ default implementation থাকা উচিত না

এখানেই abstraction আসে।

২️⃣ Abstract class কী? (এক লাইনে)

    যে class নিজে object বানাতে পারে না, সে শুধু rule দেয়।

৩️⃣ Abstract method কী? (এক লাইনে)

    যে method-এর body নাই, শুধু signature আছে


@Rule: Child must implement all abstract methods. না করলে compile error।

এখানে একসাথে আছে:

    abstraction
    inheritance
    polymorphism

    Teacher একে বলে: Perfect OOP usage

৬️⃣ সবচেয়ে গুরুত্বপূর্ণ rule (exam-killer)

❌ এইটা illegal: Animal a = new Animal();

কারণ: abstract class-এর object বানানো যায় না
কিন্তু এইটা valid: Animal a = new Cow();



৯️⃣ What is abstraction?

“Abstraction hides implementation details and shows only essential features. In Java, abstraction is achieved using abstract classes and abstract methods.” 
Example: Remote controller, Android, TV, Laptop etc.
*/



