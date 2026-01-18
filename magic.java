
package newOOP;

class A {

    A() {
        this(10);
        System.out.println("==Default constructor.It will be printed 1st.==");
    }

    A(int x) {
        System.out.println("===Parameterized constructor.It will be printed 2nd===");
    }
}

public class magic {
    public static void main(String[] args) {
        A a1 = new A();
    }
}

//Java: Clean Java Language Server Workspace
