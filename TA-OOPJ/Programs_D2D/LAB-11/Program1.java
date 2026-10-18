// Write a program that illustrates interface inheritance. Interface A is extended by A1 and 
// A2. Interface A12 inherits from both A1 and A2.Each interface declares one constant 
// and one method. Class B implements A12.Instantiate B and invoke each of its methods. 
// Each method displays one of the constants. [A] 

interface A {
    int A_CONST = 10;

    void methodA();
}

interface A1 extends A {
    int A1_CONST = 20;

    void methodA1();
}

interface A2 extends A {
    int A2_CONST = 30;

    void methodA2();
}

interface A12 extends A1, A2 {
    int A12_CONST = 40;

    void methodA12();
}

class B implements A12 {

    public void methodA() {
        System.out.println("A constant: " + A_CONST);
    }

    public void methodA1() {
        System.out.println("A1 constant: " + A1_CONST);
    }

    public void methodA2() {
        System.out.println("A2 constant: " + A2_CONST);
    }

    public void methodA12() {
        System.out.println("A12 constant: " + A12_CONST);
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