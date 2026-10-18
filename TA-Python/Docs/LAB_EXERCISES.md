# Laboratory Exercise Specifications: Python Programming (2301CS404)

This document provides problem statements, mathematical foundations, input/output specifications, and pedagogical objectives for all laboratory notebooks in **2301CS404 - Python Programming**.

---

## Academic Context

* **Course Code:** 2301CS404
* **Course Title:** Python Programming
* **Target Audience:** B.Tech CSE, Semester 4
* **Academic Year:** 2025-26
* **Reference Literature:**
  * Mark Summerfield, *Programming in Python 3: A Complete Introduction to the Python Language*, Addison-Wesley.
  * Allen B. Downey, *Think Python: How to Think Like a Computer Scientist*, O'Reilly Media.

---

## Lab-by-Lab Problem Breakdown

### Lab 1: Python Introduction & Basic I/O
* **Objective:** Understand the Python interactive shell, script execution, standard output formatting, and basic variables.
* **Problems:**
  1. Print personal details (Name, Enrollment Number, Department) with custom separators (`sep`) and end characters (`end`).
  2. Input two integers using `input()` and calculate their sum, difference, product, and quotient.
  3. Calculate the area and circumference of a circle given radius `r`.
  4. Convert temperature from Celsius to Fahrenheit: `F = (C * 9/5) + 32`.

---

### Lab 2: Variables, Data Types, and Formatting
* **Objective:** Master formatted string literals (`f-strings`), the `format()` method, type casting (`int()`, `float()`, `str()`), and numeric precision formatting.
* **Problems:**
  1. Display a formatted student score table with aligned columns using fixed-width format specifiers (e.g., `f"{name:<15}"`).
  2. Read a float number and format it to 2 decimal places, 3 decimal places, and with minimum field width of 10 characters.
  3. Calculate simple interest and compound interest:
     * `SI = (P * R * T) / 100`
     * `CI = P * ((1 + R/100) ** T) - P`
  4. Swap two variables with and without a temporary variable using Python tuple unpacking (`a, b = b, a`).

---

### Lab 3: Conditional Branching
* **Objective:** Implement decision logic using `if`, `elif`, `else`, relational operators, and logical operators (`and`, `or`, `not`).
* **Problems:**
  1. Determine whether a given number is odd or even.
  2. Find the largest among three numbers using nested conditions.
  3. Determine whether a given year is a leap year (divisible by 4 and not 100, or divisible by 400).
  4. Compute electricity consumption bills according to tiered slabs:
     * First 50 units: Free
     * 51 to 100 units: Rs. 3.25 / unit
     * 101 to 200 units: Rs. 5.26 / unit
     * Above 200 units: Rs. 8.45 / unit
  5. Check whether an entered character is a vowel, consonant, digit, or special character.

---

### Lab 4: Iterative Control Structures
* **Objective:** Use `while` loops, `for` loops, `range()`, and loop control statements (`break`, `continue`, `pass`).
* **Problems:**
  1. Print numbers from 1 to N and compute their summation using a `while` loop.
  2. Reverse an input integer using arithmetic operations (`%` and `//`).
  3. Check whether an input integer is a palindrome (e.g., 12321).
  4. Print the multiplication table of a given number using a `for` loop with formatted layout.
  5. Generate the Fibonacci sequence up to N terms.

---

### Lab 5: Mathematical Logic & Pattern Printing
* **Objective:** Apply nested loop structures for geometric and numerical pattern generation, and implement mathematical checks.
* **Problems:**
  1. Check whether a given integer is prime, and generate all prime numbers in an interval `[lower, upper]`.
  2. Check whether a given integer is an Armstrong number of order `n`.
  3. Calculate the factorial of a number using iterative loops.
  4. Print a right-angled triangle pattern of asterisks.
  5. Print Pascal's triangle using binomial coefficients.
  6. Print an inverted pyramid and diamond pattern.

---

### Lab 6: String Manipulation
* **Objective:** Manipulate strings using zero-based indexing, negative indexing, slicing `[start:stop:step]`, and built-in methods.
* **Problems:**
  1. Check whether a string is a palindrome without using built-in reverse functions.
  2. Count occurrences of vowels, consonants, digits, and whitespace characters in a given paragraph.
  3. Implement title-casing and string reversal using slicing (`string[::-1]`).
  4. Replace all occurrences of a substring with another word without using `replace()`.
  5. Extract all email addresses or numeric values from an unformatted string.

---

### Lab 7: Lists and List Comprehensions
* **Objective:** Master mutable sequence operations, list methods, multi-dimensional lists, and comprehensions.
* **Problems:**
  1. Perform list operations: `append()`, `insert()`, `remove()`, `pop()`, `reverse()`, and `sort()`.
  2. Find the largest, smallest, sum, and average of numbers in a list.
  3. Remove duplicate elements from a list while maintaining the original element order.
  4. Generate a list of squares of even numbers from 1 to 20 using list comprehension.
  5. Matrix addition and matrix transpose using nested list comprehensions.

---

### Lab 8: Tuples and Sets
* **Objective:** Understand immutable sequences (tuples) and unordered collections of unique elements (sets).
* **Problems:**
  1. Demonstrate tuple creation, indexing, slicing, and tuple unpacking.
  2. Convert a tuple to a list to modify an element and convert back to a tuple.
  3. Perform mathematical set operations on two sets:
     * Union (`|` or `union()`)
     * Intersection (`&` or `intersection()`)
     * Difference (`-` or `difference()`)
     * Symmetric Difference (`^` or `symmetric_difference()`)
  4. Check whether one set is a subset or superset of another set.

---

### Lab 9: Dictionaries
* **Objective:** Utilize hash-map key-value associations, dictionary methods, and dictionary comprehensions.
* **Problems:**
  1. Create a dictionary of student roll numbers and names, and perform add, update, delete, and lookup operations.
  2. Count the frequency of each word in a given text using a dictionary.
  3. Merge two dictionaries into a single combined dictionary.
  4. Sort a dictionary by keys and by values in ascending and descending orders.
  5. Invert a dictionary (swap keys and values).

---

### Lab 10: Functions and Lambda Expressions
* **Objective:** Define functions using `def`, configure default and keyword arguments, accept variable arguments (`*args`, `**kwargs`), and use anonymous functions (`lambda`).
* **Problems:**
  1. Define a function to calculate the GCD and LCM of two numbers.
  2. Implement recursive functions for factorial and Fibonacci generation.
  3. Write a function that accepts `*args` and returns the mean, variance, and standard deviation.
  4. Sort a list of tuples `[(name, score), ...]` based on scores using a `lambda` key.
  5. Use `map()`, `filter()`, and `reduce()` to process numerical sequences.

---

### Lab 11: Modular Programming
* **Objective:** Structure code into reusable modules and packages, import specific symbols, and understand `__name__ == "__main__"`.
* **Problems:**
  1. Create a module `Calculator.py` providing functions: `add(a, b)`, `subtract(a, b)`, `multiply(a, b)`, `divide(a, b)`, `power(a, b)`.
  2. Import the `Calculator` module into a test script using multiple import syntaxes (`import Calculator`, `from Calculator import add`, `import Calculator as calc`).
  3. Use standard library modules: `math`, `random`, `datetime`, and `sys`.

---

### Lab 12: File Input and Output Operations
* **Objective:** Perform persistent file manipulation using file modes (`'r'`, `'w'`, `'a'`, `'r+'`), context managers (`with open()`), and stream pointers.
* **Problems:**
  1. Read an entire text file (`article.txt`) and display it on the console.
  2. Read a file line by line and count total lines, words, and characters.
  3. Copy the contents of one file to another file (`demo-copy.txt`), removing all blank lines.
  4. Read a file containing numbers (`primenumbers.txt`), filter only prime numbers, and write them to a new file.
  5. Parse delimited transactional records (`purchases.txt`) and compute total sales revenue.

---

### Lab 13: Exception Handling
* **Objective:** Build robust code using `try`, `except`, `else`, `finally`, and raise custom user-defined exceptions.
* **Problems:**
  1. Handle `ZeroDivisionError` and `ValueError` when prompting the user for two integers to divide.
  2. Handle `FileNotFoundError` and `PermissionError` when opening a user-specified file path.
  3. Implement custom exception classes inheriting from `Exception` (e.g., `NegativeNumberError`, `InvalidAgeError`).
  4. Demonstrate the guaranteed cleanup execution of the `finally` block during resource deallocation.

---

### Lab 14: Object-Oriented Programming Foundations
* **Objective:** Define classes, initialize instance attributes inside `__init__()`, utilize the `self` reference, and encapsulate methods.
* **Problems:**
  1. Define a class `Rectangle` with attributes `length` and `width`, and methods `area()` and `perimeter()`.
  2. Define a class `BankAccount` with account number, holder name, balance, and methods `deposit()`, `withdraw()`, and `display_balance()`.
  3. Define a class `Employee` with salary calculation methods and display records for multiple employees.
  4. Implement special dunder methods: `__str__()` and `__repr__()`.

---

### Lab 15: Advanced OOP, Inheritance, and Polymorphism
* **Objective:** Implement class inheritance hierarchies, invoke parent constructors using `super()`, override methods, and demonstrate operator overloading.
* **Problems:**
  1. Create a base class `Person` and a derived class `Student` adding roll number and branch.
  2. Demonstrate multilevel inheritance: `Vehicle` -> `FourWheeler` -> `Car`.
  3. Demonstrate multiple inheritance and inspect Method Resolution Order (MRO) using `ClassName.__mro__`.
  4. Override `area()` in subclasses `Circle`, `Rectangle`, and `Triangle` derived from abstract-like base class `Shape`.
  5. Overload the addition operator (`+`) in a custom `ComplexNumber` or `Vector` class by implementing `__add__()`.
