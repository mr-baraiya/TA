// Define class for Complex number with real and imaginary data members, constructors, and addition method.[C]

class Complex {
    double real;
    double imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public void display() {
        System.out.printf("%.1f + %.1fi%n", real, imag);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Complex c1 = new Complex(4.5, 3.2);
        Complex c2 = new Complex(1.5, 2.8);

        System.out.print("c1 = "); c1.display();
        System.out.print("c2 = "); c2.display();

        Complex sum = c1.add(c2);
        System.out.print("c1 + c2 = "); sum.display();
    }
}
