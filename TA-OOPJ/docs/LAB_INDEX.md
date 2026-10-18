# Laboratory Program Index: Object Oriented Programming using Java (TA-OOPJ)

This document provides a systematic index of all laboratory exercises, problem definitions, class models, and technical requirements across the Diploma-to-Degree (D2D) and Master of Computer Applications (MCA) tracks.

---

## Part 1: Diploma to Degree (D2D Track - Course 2301CS362)

### LAB-1: Procedural Foundation (C & Java)
* **Program 1 (`Program1.c` / `Program1.java`):** Calculate the factors of a given integer.
* **Program 2 (`Program2.c` / `Program2.java`):** Calculate the sum of individual digits of a number (e.g., 582 -> 5 + 8 + 2 = 15).
* **Program 3 (`Program3.c` / `Program3.java`):** Calculate the sum of even numbers in a single-dimensional array.
* **Program 4 (`Program4.c` / `Program4.java`):** Print asterisk pattern grids and right-angled triangles.
* **Program 5 (`Program5.c` / `Program5.java`):** Print symmetric number patterns and Floyd's triangle.

### LAB-2: Java Control Flow & Conditionals
* **Program 1 (`Program1.java`):** Verify whether an input number is prime.
* **Program 2 (`Program2.java`):** Evaluate temperature conversions (Celsius to Fahrenheit and vice versa).
* **Program 3 (`Program3.java`):** Find the largest of three numbers using nested ternary operators.
* **Program 4 (`Program4.java`):** Check whether a given integer is an Armstrong number.
* **Program 5 (`Program5.java`):** Print Fibonacci sequence up to N terms.

### LAB-3: Basic Number Logic and Arrays
* **Program 1 (`Program1.java`):** Command-line arguments processing and summation.
* **Program 2 (`Program2.java`):** Palindrome number verification.
* **Program 3 (`Program3.java`):** Linear search on an integer array.
* **Program 4 (`Program4.java`):** Reverse array elements in-place.
* **Program 5 (`Program5.java`):** Matrix addition and dimension validation.
* **Helper Classes:** `Demo.java`, `Demo2.java`.

### LAB-4: Methods and String Operations
* **Program 1 (`Program1.java`):** Distance conversion from meters to feet using dedicated methods.
* **Program 2 (`Program2.java`):** Vowel and consonant character counter in a string.
* **Program 3 (`Program3.java`):** Custom string reversal and palindrome verification.
* **Program 4 (`Program4.java`):** Recursive implementation of power computation `x^y`.
* **Program 5 (`Program5.java`):** Finding maximum and minimum elements in an array using helper methods.
* **Program 6 (`Program6.java`):** Implementation of GCD using recursion.
* **Program 7 (`Program7.java`):** Selection sort on an integer array.

### LAB-5: Classes and Object Modeling
* **Program 1 (`Program1.java`):** Class `Circle` with `radius` field, `area()`, and `perimeter()` methods.
* **Program 2 (`Program2.java`):** Class `Time` with `hours` and `minutes`, implementing time addition.
* **Program 3 (`Program3.java`):** Class `Complex` representing complex numbers with addition and display methods.
* **Program 4 (`Program4.java`):** Class `BankAccount` modeling balance, deposit, and withdraw logic.
* **Program 5 (`Program5.java`):** Class `VowelCounter` evaluating vowel occurrences across user sentences.
* **Program 6 (`Program6.java`):** Class `Student` with roll number, name, and grade calculation.
* **Program 7 (`Program7.java`):** Class `Area` demonstrating constructor overloading for shapes.

### LAB-6: Constructors and Object-Oriented Principles
* **Program 1 (`Program1.java`):** Class `Student` with default and parameterized constructors.
* **Program 2 (`Program2.java`):** Class `Employee` with employee ID, name, designation, and salary calculation.
* **Program 3 (`Program3.java`):** Class `Cube` demonstrating volume computation and copy constructors.
* **Program 4 (`Program4.java`):** Class `Account` modeling interest calculation over time.
* **Program 5 (`Program5.java`):** Class demonstrating the `this` keyword to differentiate instance fields from arguments.
* **Program 6 (`Program6.java`):** Class demonstration of static variables and static counter tracking total instances.

### LAB-7: Static Methods and Overloading
* **Program 1 (`Program1.java`):** Method overloading for calculating areas of circle, rectangle, and triangle.
* **Program 2 (`Program2.java`):** Static method demonstrating mathematical utility operations.
* **Program 3 (`Program3.java`):** Adding two `Complex` objects passed as method parameters.
* **Program 4 (`Program4.java`):** Demonstrating variable-length arguments (`varargs`).

### LAB-8: Inheritance and Hierarchy
* **Program 1 (`Program1.java`):** Single inheritance: Superclass `BankAccount` and subclass `SavingsAccount`.
* **Program 2 (`Program2.java`):** Multilevel inheritance: `Person` -> `Employee` -> `Manager`.
* **Program 3 (`Program3.java`):** Super keyword usage for accessing parent variables and invoking parent constructors.
* **Program 4 (`Program4.java`):** Hierarchical inheritance: Base class `House` and derived architectural variants.
* **Program 5 (`Program5.java`):** Method overriding demonstrating dynamic method dispatch.

### LAB-9: Polymorphism and Real-World Domains
* **Program 1 (`Program1.java`):** Superclass `Book` and derived classes `BookPublication` and `PaperPublication`.
* **Program 2 (`Program2.java`):** Superclass `Employee` and derived class `HRManager` overriding `work()` and `addEmployee()`.
* **Program 3 (`Program3.java`):** Base class `MyPoint` and derived class `ThreeDPoint` calculating Euclidean distances.
* **Program 4 (`Program4.java`):** Inheritance model between `Parent` and `Child` verifying constructor chaining.
* **Program 5 (`Program5.java`):** Class `Student` demonstrating polymorphic behavior under an academic evaluation framework.

### LAB-10: Abstract Classes
* **Program 1 (`Program1.java`):** Abstract class `Vegetable` with abstract method `toString()`, extended by `Potato`, `Tomato`, and `Brinjal`.
* **Program 2 (`Program2.java`):** Abstract class `Vehicle` with derived classes `Car` and `Motorcycle`.
* **Program 3 (`Program3.java`):** Abstract class `BankAccount` with derived classes `SavingsAccount` and `CurrentAccount`.

### LAB-11: Interfaces and Multiple Inheritance
* **Program 1 (`Program1.java`):** Interface `Transport` with method `deliver()`, implemented by `Animal` subclasses `Tiger`, `Camel`, `Deer`, and `Donkey`.
* **Program 2 (`Program2.java`):** Multiple interfaces `A` and `B` implemented by class `C` to simulate multiple inheritance.
* **Program 3 (`Program3.java`):** Interface `Playable` implemented by `Football`, `Volleyball`, and `Basketball`.
* **Program 4 (`Program4.java`):** Interface `EventDemo` combining `MouseListener` and `KeyListener` contracts.
* **Program 5 (`Program5.java`):** Extended interfaces hierarchy (`A1`, `A2`, `A12`).

### LAB-12: Exception Handling
* **Program 1 (`Program1.java`):** Basic `try-catch-finally` handling `ArithmeticException` and `ArrayIndexOutOfBoundsException`.
* **Program 2 (`Program2.java`):** Multiple catch blocks and exception propagation with `throw` and `throws`.
* **Program 3 (`Program3.java`):** Custom exception `AgeException` checking legal voter eligibility.
* **Program 4 (`Program4.java`):** Custom exception `InSufficientFundException` validating bank withdrawals.
* **Program 5 (`Program5.java`):** Custom exception `OutOfRangeException` validating numerical input boundaries.

### LAB-13: Multithreading and Concurrency
* **Program 1 (`Program1.java`):** Thread creation by extending `Thread` class (`ThreadByClass`).
* **Program 2 (`Program2.java`):** Thread creation by implementing `Runnable` interface (`ThreadByRunnable`).
* **Program 3 (`Program3.java`):** Concurrent printing: Thread 1 prints "Good Morning" every 1000ms, Thread 2 prints "Good Afternoon" every 3000ms.
* **Program 4 (`Program4.java`):** Even and Odd number generation across two concurrent threads (`EvenPrinter`, `OddPrinter`).
* **Program 5 (`Program5.java`):** Classic Producer-Consumer synchronization using bounded `Buffer` with `wait()` and `notify()`.
* **Program 6 (`Program6.java`):** Parallel matrix row summation task (`RowSumTask`).

### LAB-14: File Handling and Streams
* **Program 1 (`Program1.java`):** Reading and writing character files using `FileReader` and `FileWriter`.
* **Program 2 (`Program2.java`):** Line-by-line reading using `BufferedReader` and line count tracking.
* **Program 3 (`Program3.java`):** Copying binary files using `FileInputStream` and `FileOutputStream`.
* **Program 4 (`Program4.java`):** Reading structured `Student` records from a text file and parsing attributes.

### LAB-15: Collections and Entity Persistence
* **Program 1 (`Program1.java`):** Managing dynamic list of student records using `ArrayList`.
* **Program 2 (`Program2.java`):** Sorting custom `StudentRecord` objects using `Comparable`.

---

## Part 2: Master of Computer Applications (MCA Track - Course 2605CS102)

### Labs 1 to 4: Foundations
* **LAB-1:** C review problems covering factors, digit sums, patterns, and introductory Java syntax.
* **LAB-2:** Fundamental Java console applications, data types, and arithmetic logic.
* **LAB-3:** Decision-making structures, palindromes, prime detection, and conditional evaluation.
* **LAB-4:** Looping structures, Armstrong numbers, Fibonacci generation, and array manipulations.

### Labs 5 to 10: Object Foundations
* **LAB-5:** Basic class models, state encapsulation, getters and setters.
* **LAB-6:** Constructor design patterns, constructor overloading, and object initialization.
* **LAB-7:** Parameter passing semantics, passing objects to methods, and returning objects.
* **LAB-8:** Static members, static counters, and utility classes.
* **LAB-9:** Array of objects, batch object processing (`ArrayManager`), and linear filtering.
* **LAB-10:** String processing methods, character frequency counting, and string immutability.

### Labs 11 to 15: Object Relationships & Polymorphism
* **LAB-11:** Class `Student` and `Account` modeling basic inheritance relationships.
* **LAB-12:** Class `Employee` and `PlacementStudent` modeling corporate and university hierarchies.
* **LAB-13:** Overloading mathematical operations across geometric entities (`Circle`, `Complex`).
* **LAB-14:** Time manipulation with `AdjustableTime`, `BankAccount`, and `Item` catalogs.
* **LAB-15:** Hierarchical domain structures (`CorporateEmployee`, `House`, `StudentComparison`).

### Labs 16 to 19: Real-World Enterprise Domain Modeling
* **LAB-16:** Banking and University architectures: `BaseAccount`, `SavingsAccount`, `CurrentAccount`, `Person`, `UnivStudent`, `Faculty`, `Exam`.
* **LAB-17:** Payment gateway system (`PaymentMethod`, `CreditCardPayment`, `NetBankingPayment`, `UPIPayment`) and hospital management (`Department`, `Hospital`).
* **LAB-18:** Abstract agricultural and automotive catalogs: `Vegetable` (`Tomato`, `Potato`, `Brinjal`) and `Vehicle` (`Car`, `Motorcycle`).
* **LAB-19:** Specialized service categories: Hospital specialties (`Cardiology`, `Neurology`, `Pediatrics`), Dining (`FineDining`, `FastFood`, `Cafe`), and Membership tiers.

### Labs 20 to 21: Interface Contracts
* **LAB-20:** Interface implementation for logistical transports (`Transport`, `Animal`, `Camel`, `Tiger`, `Deer`).
* **LAB-21:** Polymorphic interface contracts (`Playable` sports items, `Device` -> `SmartDevice` -> `SmartPhone`).

### Labs 22 to 23: Robust Exception Handling
* **LAB-22:** Custom application exceptions (`AgeException`, `InSufficientFundException`) with bank accounts.
* **LAB-23:** Multi-layered exception propagation and range verification (`OutOfRangeException`, `UserAccount`).

### Labs 24 to 26: Advanced Concurrency & Synchronization
* **LAB-24:** Multi-threaded task scheduling (`GoodMorningRunner`, `GoodAfternoonRunner`, `EvenPrinter`, `OddPrinter`).
* **LAB-25:** Academic security and concurrent records (`AccountSecurityDemo`, `UnivFacultyRecord`, `UnivStudentRecord`).
* **LAB-26:** Thread synchronization, shared monitor locking, Producer-Consumer architecture (`Buffer`, `Producer`, `Consumer`), and parallel row processing (`RowSumTask`, `TablePrinter`).

### Labs 27 to 28: Persistent File Streams
* **LAB-27:** Character and buffered file streams, persistent student logs (`StudentFileRecord`).
* **LAB-28:** Byte stream processing, binary file copying, and serialized record storage.

### Labs 29 to 30: Collections Framework & Sorting
* **LAB-29:** Dynamic collections using `ArrayList`, custom sorting on `StudentItem` and `StudentSortable` via `Comparable` and `Comparator`.
* **LAB-30:** Enterprise food menu ordering catalog using `FoodItem`, `Pizza`, and `Burger` models.
