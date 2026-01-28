package newOOP;

class A {
    void show(int x) {
        System.out.println("A int");
    }
}

class B extends A {
    void show(double x) {
        System.out.println("B double");
    }
}

public class magic2 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println("HELLO MAGIC2");
        a.show(10); // A int
        // a.show(10.5); // ❌ compile error

    }
}

// compiler দেখে A reference
// 10.5 int noi, tai compile time ei erro, runtime e jete parbena.
