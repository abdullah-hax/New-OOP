// Interface, inheretance না

package newOOP;

interface Payment {
    void pay(double amount); // what to do : pay krte hbe
                             // how to do : bole deya nai

}

class Bkash implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via Bkash");
    }
}

class Card implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via Card");
    }
}

public class Interface {

}

/* ✔ Interface ব্যবহার করবে যখন:

    শুধু ability/capability define করতে চাও
    class গুলোর মধ্যে “is-a” সম্পর্ক নাই
    code share করার দরকার নাই */

/* Interface → only contract (ja method dibo sb implement krte hobe, karon only abstract class ache)
Abstract class → contract + partial implementation (normal class)*/


/* ৫️⃣ তাহলে “class গুলোর মধ্যে is-a নাই” কথাটার মানে কী?

Class গুলো একই পরিবারভুক্ত না,
কিন্তু একই capability share করে

তাই:
    abstract class ❌ (family লাগে)
    interface ✅ (capability লাগে) */