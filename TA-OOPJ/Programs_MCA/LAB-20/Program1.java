// Interface inheritance: A -> A1, A2; A12 -> A1, A2. Class B implements A12.[A]

interface A {
    int CONST_A = 10;
    void methodA();
}

interface A1 extends A {
    int CONST_A1 = 20;
    void methodA1();
}

interface A2 extends A {
    int CONST_A2 = 30;
    void methodA2();
}

interface A12 extends A1, A2 {
    int CONST_A12 = 40;
    void methodA12();
}

class B implements A12 {
    @Override
    public void methodA() {
        System.out.println("methodA() displaying CONST_A = " + CONST_A);
    }

    @Override
    public void methodA1() {
        System.out.println("methodA1() displaying CONST_A1 = " + CONST_A1);
    }

    @Override
    public void methodA2() {
        System.out.println("methodA2() displaying CONST_A2 = " + CONST_A2);
    }

    @Override
    public void methodA12() {
        System.out.println("methodA12() displaying CONST_A12 = " + CONST_A12);
    }
}

public class Program1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.methodA();
        obj.methodA1();
        obj.methodA2();
        obj.methodA12();
    }
}
