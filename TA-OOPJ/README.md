# Object Oriented Programming using Java (TA-OOPJ)

This directory contains laboratory assignments, institutional practical lists, and Java source implementations for the **Object Oriented Programming using Java** course across two specialized academic programs:
1. **Diploma-to-Degree (D2D):** B.Tech CSE Semester 3 (Course Code: 2301CS362)
2. **Master of Computer Applications (MCA):** Semester 1 (Course Code: 2605CS102)

---

## Academic Track Summary

| Program Track | Course Code | Directory | Total Labs | Practical Manual | Focus Scope |
| :--- | :--- | :--- | :--- | :--- | :--- |
| Diploma to Degree (D2D) | 2301CS362 | `Programs_D2D/` | 15 Labs | `D2D_PracticalList_OOP_2026.pdf` | Core OOP, Inheritance, Interfaces, Exceptions, Multithreading, File I/O |
| MCA | 2605CS102 | `Programs_MCA/` | 30 Labs | `MCA_PracticalList_OOP_2026.pdf` | Comprehensive Java SE, Domain Architectures, Concurrency, Collections |

---

## Directory Organization

```text
TA-OOPJ/
|-- README.md                         # Track documentation and compilation guidelines
|-- docs/
|   `-- LAB_INDEX.md                  # Comprehensive unit-by-unit problem mapping
|
|-- Programs_D2D/                     # Diploma-to-Degree Laboratory Track
|   |-- D2D_PracticalList_OOP_2026.pdf# Official D2D practical list syllabus
|   |-- LAB-1/                        # Procedural C & Java foundation
|   |-- LAB-2/ to LAB-7/              # Control structures, classes, methods, overloading
|   |-- LAB-8/ to LAB-11/             # Inheritance, abstract classes, interfaces
|   |-- LAB-12/                       # Exception handling and custom exceptions
|   |-- LAB-13/                       # Multithreading and Producer-Consumer synchronization
|   `-- LAB-14/ to LAB-15/            # File streams, serialization, collection records
|
`-- Programs_MCA/                     # MCA Laboratory Track
    |-- MCA_PracticalList_OOP_2026.pdf# Official MCA practical manual (11 pages)
    |-- LAB-1/ to LAB-4/              # C review, basic Java syntax, flow control, arrays
    |-- LAB-5/ to LAB-10/             # Class design, constructors, methods, strings
    |-- LAB-11/ to LAB-15/            # Overloading, overriding, real-world hierarchies
    |-- LAB-16/ to LAB-19/            # Domain systems (Banking, Hospital, Dining, Membership)
    |-- LAB-20/ to LAB-21/            # Interfaces, event simulation, multiple inheritance
    |-- LAB-22/ to LAB-23/            # Robust exception handling architectures
    |-- LAB-24/ to LAB-26/            # Multithreading, thread safety, synchronization
    |-- LAB-27/ to LAB-28/            # File I/O, character/byte streams, persistent records
    `-- LAB-29/ to LAB-30/            # Collections framework, Comparable, Comparator
```

---

## Curriculum Topic Matrix

### 1. Fundamentals and Procedural Transition (Labs 1 to 4)
* Transition from C programming to Java syntax.
* Java primitive types, arithmetic and relational operations, command-line arguments (`args[]`).
* Interactive input reading via `java.util.Scanner` and `java.io.BufferedReader`.
* Decision-making constructs (`if-else`, `switch-case`) and looping (`for`, `while`, `do-while`).
* Array operations, linear searches, and element filtering.

### 2. Object-Oriented Foundations (Labs 5 to 10)
* Class definition, instance variables, methods, and instantiation with `new`.
* The `this` keyword and variable shadowing resolution.
* Constructors: Default, parameterized, and copy constructors.
* Method overloading (compile-time polymorphism).
* Class-level static variables and static methods.
* String class manipulation (`String`, `StringBuilder`, `StringBuffer`).

### 3. Inheritance, Polymorphism, and Abstraction (Labs 11 to 21)
* Single, multilevel, and hierarchical inheritance using `extends`.
* Superclass constructor invocation and method referencing via `super`.
* Method overriding and runtime polymorphism (dynamic method dispatch).
* Abstract classes and abstract methods.
* Interface design using `interface` and `implements`.
* Multiple inheritance simulation through interfaces.
* Real-world domain modeling:
  * Banking systems (`BankAccount`, `SavingsAccount`, `CurrentAccount`)
  * Hospital management (`Hospital`, `Cardiology`, `Neurology`, `Pediatrics`)
  * Academic management (`UnivStudentRecord`, `UnivFacultyRecord`, `PlacementStudent`)
  * Vehicle classification (`Vehicle`, `Car`, `Motorcycle`, `Thar`, `Swift`)

### 4. Exception Handling Architecture (Labs 12 D2D / Labs 22-23 MCA)
* Checked vs. unchecked exceptions (`Exception` vs. `RuntimeException`).
* `try`, `catch`, `finally`, `throw`, and `throws` syntax.
* Multiple catch blocks and multi-catch clauses.
* Custom user-defined exception hierarchies:
  * `AgeException`: Validating voter and eligibility ages.
  * `InSufficientFundException`: Enforcing minimum account balance rules.
  * `OutOfRangeException`: Enforcing mathematical and input boundary constraints.

### 5. Multithreading and Concurrency (Labs 13 D2D / Labs 24-26 MCA)
* Thread creation by extending `java.lang.Thread` and implementing `java.lang.Runnable`.
* Thread lifecycle states (New, Runnable, Blocked, Waiting, Timed Waiting, Terminated).
* Thread priorities, `sleep()`, `join()`, and `yield()`.
* Synchronization mechanisms: Synchronized methods and synchronized blocks.
* Inter-thread communication (`wait()`, `notify()`, `notifyAll()`).
* Classic concurrency problems: Producer-Consumer synchronization with bounded buffer (`Buffer`, `Producer`, `Consumer`).
* Parallel divide-and-conquer processing (e.g., `RowSumTask`).

### 6. File Handling and Streams (Labs 14 D2D / Labs 27-28 MCA)
* The `java.io` package hierarchy.
* Byte streams (`FileInputStream`, `FileOutputStream`).
* Character streams (`FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`).
* File metadata inspection (`java.io.File`).
* Persistent entity serialization and deserialization.

### 7. Java Collections Framework (Labs 15 D2D / Labs 29-30 MCA)
* Dynamic arrays using `java.util.ArrayList`.
* Custom object sorting using `java.lang.Comparable` (`compareTo()`) and `java.util.Comparator` (`compare()`).
* Iterators and enhanced for-loops.

---

## Compilation and Execution Instructions

### Single-File Programs
Navigate to the desired lab folder and compile the target Java file:
```bash
cd Programs_MCA/LAB-5
javac Program1.java
java Program1
```

### Multi-File Programs
Many programs define auxiliary domain classes (e.g., `Account.java`, `Student.java`, `Circle.java`) in separate files or as top-level classes in the same directory. To compile all dependent sources simultaneously:
```bash
cd Programs_MCA/LAB-18
javac *.java
java Program1
```

### Handling Command-Line Arguments
For exercises expecting arguments via `main(String[] args)`:
```bash
javac Program2.java
java Program2 10 25 30
```

---

## Clean Repository Rules

* All compiled `.class` bytecode files are strictly excluded from version control via the root `.gitignore`.
* Do not manually stage or commit `.class` files into the repository.
* When editing source files, verify that they compile cleanly with no compiler warnings before committing.

---

## Complete Problem Catalog

For the exhaustive list of questions, problem specifications, and program-by-program index for both D2D and MCA tracks, refer to [docs/LAB_INDEX.md](./docs/LAB_INDEX.md).
