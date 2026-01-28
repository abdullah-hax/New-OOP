package newOOP;

public class Throws {
    
}
/* ৪️⃣ তাহলে throws কেন?

এখন ধরো এই method টা:

void checkAge(int age) {
    if (age < 18) {
        throw new ArithmeticException();
    }
}


এই exception কে handle করবে কে?

২টা option:

Option 1: নিজেই handle করো (try–catch)
void checkAge(int age) {
    try {
        if (age < 18) {
            throw new ArithmeticException();
        }
    } catch (ArithmeticException e) {
        System.out.println("Invalid age");
    }
}

Option 2: আমি handle করব না (throws)
void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
        throw new ArithmeticException();
    }
}


এখানে method বলছে:

“এই exception আমি ধরব না
যে আমাকে call করবে, সে ধরুক”

👉 throws = responsibility অন্যের ঘাড়ে দেওয়া

🔑 One-line difference (exam gold)

throw → exception তৈরি করে ছুড়ি

throws → exception ধরার দায়িত্ব caller-কে দেই */