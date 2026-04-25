package newOOP;

public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        // System.out.println("Program continues");

        // try {
        //     int[] arr = new int[3];
        //     System.out.println(arr[5]);
        // } catch (ArithmeticException e) {
        //     System.out.println("Arithmetic error");
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Array index error");
        // }

        // try {
        //     int a = 10 / 2;
        //     System.out.println(a);
        // } catch (Exception e) {
        //     System.out.println("Error");
        // } finally {
        //     System.out.println("Always runs");
        // }
        // 👉 exception হোক বা না হোক
        // 👉 finally চলবেই

    }
}


/* ⚠️ Exception মানে কী? (plain ভাষায়)

Exception = Program চলার সময় যদি এমন কিছু ঘটে যেটা program normally handle করতে পারে না—সেটাই exception
Exception = program চলার সময় হওয়া একটা সমস্যা, যেটা Java নিজে চিনে ফেলে

উদাহরণ:

    ১০ / ০ = error
    array index বাইরে
    file নাই, কিন্তু পড়তে চাও

👉 এগুলো runtime problem */


// ---------------------------------------
/* ১০ ÷ ০ = impossible

Java ভাবে: “এটা গাণিতিকভাবে ভুল”

তাই Java নিজেই ArithmeticException object বানায়
এবং ছুড়ে দেয়।

👉 এই object তুমি বানাও নি
👉 Java বানিয়েছে

এইটাই ArithmeticException */

/* Array-তে index আছে: 0, 1, 2

    তুমি চাইছো: 5
    Java ভাবে: “এই index তো নাই”
    তাই Java নিজেই বলে: ArrayIndexOutOfBoundsException

    👉 আবারও: Java বানিয়েছে, তুমি না

    🔑 গুরুত্বপূর্ণ কথা (এইটা খুব দরকার)
    Exception object Java নিজে বানায়, যখন ভুলটা Java বুঝতে পারে */

// ------------------------------------------------

/* 🔍 খুব গুরুত্বপূর্ণ analogy (মাথায় বসে যাবে)

    Exception = accident
    try = risky road
    catch = ambulance

    Accident হলে:
    ambulance থাকলে → মানুষ বাঁচে
    না থাকলে → মৃত্যু (program crash) */

// ------------------------------------------------

/*  try -> real exception
    catch -> exception এলে program বাঁচানোর উপায়
    
    throw -> amar banano exception (like age < 40)
    throws ->
    */