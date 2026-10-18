# Course Syllabus and Laboratory Problems: Computer Programming using C (2301CS101)

This document outlines the laboratory curriculum, problem statements, and implementation guidelines for the first-year undergraduate course **2301CS101 - Computer Programming using C**.

---

## Course Structure and Examination Scheme

* **Course Code:** 2301CS101
* **Semester:** 1
* **Teaching Scheme:** 3 Lectures, 0 Tutorials, 2 Lab Hours per week
* **Credits:** 4
* **Assessment Scheme:**
  * Continuous Internal Assessment (CIA) - Practical: 10 Marks
  * Semester End Examination (SEE) - Practical: 20 Marks
  * Total Practical Weightage: 30 Marks

---

## Detailed Laboratory Units and Problem Specifications

### Unit 1: Basic Input/Output and Arithmetic Expressions

#### Objective
Familiarize students with the C standard library (`stdio.h`), primitive data types (`int`, `float`, `char`, `double`), arithmetic operators, and console formatting.

#### Category A (Fundamental)
1. Write a program to print "Hello World" using standard output.
2. Write a program to calculate the area and perimeter of a circle given its radius.
3. Write a program to calculate simple interest: `SI = (P * R * T) / 100`.
4. Write a program to convert temperature from Fahrenheit to Celsius: `C = ((F - 32) * 5) / 9`.
5. Write a program to calculate the average of three floating-point numbers.

#### Category B (Intermediate)
1. Write a program to swap two numbers using a temporary third variable.
2. Write a program to swap two numbers without using a temporary variable (arithmetic or XOR method).
3. Write a program to convert total days entered by the user into years, weeks, and remaining days.

#### Category C (Advanced)
1. Write a program to calculate the angle between the hour hand and the minute hand of a clock for given time `HH:MM`.
2. Write a program to print "Hello World" without using a semicolon (`;`) in the entire source code (e.g., using `if (printf("Hello World\n")) {}`).

---

### Unit 2: Decision Making - If, If-Else, and Relational Operators

#### Objective
Understand Boolean logic, relational expressions (`<`, `>`, `<=`, `>=`, `==`, `!=`), and conditional branch execution.

#### Category A (Fundamental)
1. Write a program to check whether a given integer is positive, negative, or zero.
2. Write a program to check whether a given year is a leap year.
3. Write a program to find the largest of two numbers.
4. Write a program to check whether a character entered by the user is an alphabet, digit, or special symbol.

#### Category B (Intermediate)
1. Write a program to check whether a given number is odd or even without using the `%` (modulus) operator (e.g., using bitwise AND: `(n & 1)`).
2. Write a program to check whether a character is an uppercase or lowercase alphabet, and print its ASCII decimal value.
3. Write a program to read current system time and display it using `<time.h>` and `ctime()`.

#### Category C (Advanced)
1. Write a program to demonstrate machine shutdown or reboot using `system()` from `<stdlib.h>`.
2. Write a program to check whether a given character is a vowel or consonant using only a single `if` statement.

---

### Unit 3: Decision Making - Nested If, Ladder If, and Switch-Case

#### Objective
Master multi-way branching, ladder conditionals, and discrete switch-case jump tables.

#### Category A (Fundamental)
1. Write a program to find the maximum of three numbers using nested `if` statements.
2. Write a program to read marks of five subjects, calculate the total and percentage, and display class/grade:
   * Fail: < 35%
   * Pass Class: 35% to 45%
   * Second Class: 46% to 60%
   * First Class: 61% to 70%
   * Distinction: > 70%
3. Write a program using `switch-case` to input a day number (1 to 7) and display the corresponding day of the week.
4. Write a program to perform basic arithmetic operations (Add, Subtract, Multiply, Divide) using `switch-case`.

#### Category B (Intermediate)
1. Write a program to calculate total electricity charges based on tiered units:
   * First 50 units: Rs. 0.50 / unit
   * Next 100 units (51-150): Rs. 0.75 / unit
   * Next 100 units (151-250): Rs. 1.20 / unit
   * Units above 250: Rs. 1.50 / unit
   * An additional surcharge of 20% is added to the total bill.
2. Write a program to check whether roots of a quadratic equation `ax^2 + bx + c = 0` are real, equal, or complex, and compute the roots.

#### Category C (Advanced)
1. Write a program using `switch-case` to input month number and year, and print the number of days in that month, properly handling leap years for February.
2. Write a program to find the maximum of two numbers using the ternary conditional operator (`? :`).

---

### Unit 4: Iterative Statements - While and Do-While Loops

#### Objective
Implement iterative algorithms, accumulator variables, digit extractions, and condition-controlled looping.

#### Category A (Fundamental)
1. Write a program to print numbers from 1 to N using a `while` loop.
2. Write a program to print all odd numbers between 1 and N.
3. Write a program to calculate the sum of numbers from 1 to N.
4. Write a program to compute the factorial of a given integer N.

#### Category B (Intermediate)
1. Write a program to reverse a given integer number (e.g., input: 1234, output: 4321).
2. Write a program to check whether a given number is a palindrome (e.g., 1221).
3. Write a program to calculate the sum of the digits of a number.
4. Write a program to check whether a number is an Armstrong number (sum of cubes of digits equals the number, e.g., 153).

#### Category C (Advanced)
1. Write a program to check whether a given integer is a prime number.
2. Write a program to convert a binary number to its decimal representation, and vice versa.

---

### Unit 5: Iterative Statements - For Loops and Nested Loops

#### Objective
Utilize counter-controlled iterations and nested loop indices for multi-dimensional coordinate processing and pattern generation.

#### Category A (Fundamental)
1. Write a program to print the multiplication table of a given number N.
2. Write a program to compute the value of `X^Y` without using the `pow()` library function.
3. Write a program to generate the first N terms of the Fibonacci series (0, 1, 1, 2, 3, 5, 8, ...).

#### Category B (Intermediate)
1. Write a program to print right-angled triangle patterns using asterisks:
   ```text
   *
   * *
   * * *
   * * * *
   ```
2. Write a program to print right-angled triangle patterns using increasing numbers:
   ```text
   1
   1 2
   1 2 3
   1 2 3 4
   ```
3. Write a program to print Floyd's triangle:
   ```text
   1
   2 3
   4 5 6
   7 8 9 10
   ```

#### Category C (Advanced)
1. Write a program to print Pascal's triangle for N rows.
2. Write a program to print an inverted full pyramid pattern and diamond pattern using asterisks.

---

### Unit 6: Single-Dimensional Arrays

#### Objective
Learn contiguous memory allocation, zero-indexed array traversal, bounds checking, and linear algorithms.

#### Category A (Fundamental)
1. Write a program to read N elements into an array and print them in original and reverse order.
2. Write a program to find the maximum and minimum elements in an array.
3. Write a program to calculate the sum and average of all array elements.

#### Category B (Intermediate)
1. Write a program to search for an element in an array using Linear Search.
2. Write a program to search for an element in a sorted array using Binary Search.
3. Write a program to count total positive, negative, and zero elements in an array.

#### Category C (Advanced)
1. Write a program to sort an array of N numbers in ascending order using Bubble Sort or Selection Sort.
2. Write a program to delete duplicate elements from an array.

---

### Unit 7: Two-Dimensional Arrays and Matrices

#### Objective
Manipulate row-major matrix allocations, matrix mathematics, and coordinate traversal.

#### Category A (Fundamental)
1. Write a program to read and print a 2D matrix of size `R x C`.
2. Write a program to calculate the sum of all elements in a 2D matrix.
3. Write a program to find row-wise and column-wise sums of a given matrix.

#### Category B (Intermediate)
1. Write a program to perform matrix addition and subtraction of two matrices.
2. Write a program to find the transpose of a given `R x C` matrix.
3. Write a program to check whether a given square matrix is symmetric (`A[i][j] == A[j][i]`).

#### Category C (Advanced)
1. Write a program to compute the product of two matrices `A` (size `m x k`) and `B` (size `k x n`).
2. Write a program to calculate the sum of the primary diagonal and secondary diagonal elements of a square matrix.

---

### Unit 8: User-Defined Functions

#### Objective
Modularize code using function declarations, parameter passing mechanisms, return values, and recursion.

#### Category A (Fundamental)
1. Write a user-defined function to compute the square and cube of a number.
2. Write a function to find the maximum of two numbers.
3. Write a function to check whether a given number is prime.

#### Category B (Intermediate)
1. Write a function to swap two numbers using Call by Reference (pointers).
2. Write a recursive function to compute the factorial of a number N.
3. Write a recursive function to compute the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm.

#### Category C (Advanced)
1. Write a recursive function to solve the Tower of Hanoi problem for N disks.
2. Write a function that accepts an array and its size as arguments and returns the second largest element.

---

### Unit 9: String Manipulation

#### Objective
Work with null-terminated character strings, string library routines, and custom pointer-based string algorithms.

#### Category A (Fundamental)
1. Write a program to read a string and print its length without using `strlen()`.
2. Write a program to copy one string into another without using `strcpy()`.
3. Write a program to concatenate two strings without using `strcat()`.

#### Category B (Intermediate)
1. Write a program to reverse a string in-place without using `strrev()`.
2. Write a program to check whether a given string is a palindrome.
3. Write a program to count total vowels, consonants, digits, and spaces in a given string.

#### Category C (Advanced)
1. Write a program to compare two strings lexicographically without using `strcmp()`.
2. Write a program to convert all lowercase letters to uppercase and vice versa (case toggle) in a string.

---

### Unit 10: Pointers and Dynamic Memory Allocation

#### Objective
Understand memory addresses, pointer dereferencing (`*`), address-of (`&`), and runtime heap memory management.

#### Category A (Fundamental)
1. Write a program to print the address and value of a variable using pointers.
2. Write a program to add two numbers using pointers.
3. Write a program to input and print array elements using pointer notation.

#### Category B (Intermediate)
1. Write a program to find the length of a string using a pointer.
2. Write a program to copy one array into another array using pointers.
3. Write a program to allocate memory dynamically for an integer array using `malloc()`, compute their sum, and release the memory using `free()`.

#### Category C (Advanced)
1. Write a program to allocate memory for N students' marks dynamically using `calloc()`, reallocate if needed using `realloc()`, and free the memory.
2. Write a program to demonstrate pointer to pointer (`**ptr`).

---

### Unit 11: Structures, Unions, and File Handling

#### Objective
Aggregate heterogeneous data members, define user data models, and perform persistent disk file I/O operations.

#### Category A (Fundamental)
1. Write a program to define a `struct Student` with fields (RollNo, Name, Marks), input data for one student, and display it.
2. Write a program to define a `struct Distance` with fields (feet, inches) and compute the sum of two distances.
3. Write a program to open a text file in write mode, write a line of text, and close it using `fopen()` and `fclose()`.

#### Category B (Intermediate)
1. Write a program to store and display records of N students using an array of structures.
2. Write a program to read an existing text file character by character and display the contents on the console using `fgetc()`.
3. Write a program to copy the contents of one file to another file.

#### Category C (Advanced)
1. Write a program to count total characters, words, and lines in a text file.
2. Write a program to append student records to a binary file using `fwrite()` and search for a record by Roll Number using `fread()`.
