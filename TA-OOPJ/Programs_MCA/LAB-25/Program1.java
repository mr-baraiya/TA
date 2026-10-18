// Package 'Darshan' with class 'BTech' within it, and class 'University' importing it.[A]

import Darshan.BTech;

public class Program1 {
    public static void main(String[] args) {
        BTech b = new BTech();
        b.display();
    }
}

// javac -d . Darshan\BTech.java Program1.java
// java Program1