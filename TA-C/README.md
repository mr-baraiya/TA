# Computer Programming using C (Course Code: 2301CS101)

This directory contains instructional materials, syllabus outlines, and laboratory assignments for the **Computer Programming using C** course offered to first-year undergraduate students in Bachelor of Technology (B.Tech) Computer Science and Engineering and Bachelor of Computer Science (Honours).

---

## Course Overview

* **Course Code:** 2301CS101
* **Course Title:** Computer Programming using C
* **Target Audience:** B.Tech CSE & B.Sc (Honours), Semester 1
* **Course Type:** Engineering Science
* **Primary Language:** C (C99 / C11 Standard)
* **Compiler:** GCC (MinGW-w64 on Windows, GCC on GNU/Linux)

---

## Directory Contents

| File / Directory | Description |
| :--- | :--- |
| `LAB_Manual_C_2025_V2.pdf` | Official institutional practical manual containing categorized laboratory problems across 11 instructional units. |
| `docs/SYLLABUS_AND_LABS.md` | Detailed breakdown of each laboratory unit, problem statements, and educational outcomes. |

---

## Syllabus Summary

The laboratory curriculum is divided into progressive units categorized into Section A (Fundamental), Section B (Intermediate), and Section C (Advanced):

1. **Unit 1: Basic Input/Output and Arithmetic Expressions**
   * Data types, format specifiers (`%d`, `%f`, `%c`, `%lf`), arithmetic operators.
   * Simple interest calculation, temperature conversions, unit billing.
2. **Unit 2: Decision Making - Simple If and If-Else**
   * Relational and logical operators.
   * Odd/even checks without modulo operators, character classification (vowel/consonant).
   * System interaction (`system()` call for machine shutdown, `<time.h>` for timestamps).
3. **Unit 3: Decision Making - Nested If, Ladder If, and Switch-Case**
   * Electricity tariff billing calculation with tiered slabs and surcharge.
   * Grading classifications and day/month calculators.
   * Conditional ternary operator (`? :`).
4. **Unit 4: Iteration - While Loops**
   * Iterative number processing, sum of series, factorials, digit extraction, reversing numbers.
   * Armstrong numbers, prime checks, and palindrome checks.
5. **Unit 5: Iteration - For Loops and Nested Loops**
   * Multiplication tables, Fibonacci sequence generation, power computations.
   * Numeric, alphabetic, and asterisk patterns.
6. **Unit 6: Single-Dimensional Arrays**
   * Array initialization, traversal, linear search, binary search.
   * Minimum, maximum, average calculation, frequency count, and array sorting.
7. **Unit 7: Two-Dimensional Arrays and Matrices**
   * Matrix addition, subtraction, scalar multiplication, and matrix multiplication.
   * Transpose operations, symmetric matrix checks, and diagonal element sums.
8. **Unit 8: User-Defined Functions**
   * Function declaration, definition, and call semantics.
   * Call by value vs. call by reference (pointers).
   * Recursive functions (factorial, GCD, power).
9. **Unit 9: String Manipulation**
   * Null-terminated character arrays.
   * Custom implementations of `strlen`, `strcpy`, `strcat`, and `strcmp`.
   * Case inversion and palindrome string verification.
10. **Unit 10: Pointers and Dynamic Memory**
    * Pointer arithmetic, dereferencing, pointer-to-pointer.
    * Swapping values using pointers, dynamic memory allocation (`malloc`, `calloc`, `free`).
11. **Unit 11: Structures and File Handling**
    * Structure definitions, nested structures, array of structures.
    * File operations: `fopen`, `fclose`, `fprintf`, `fscanf`, `fgets`, `fputs`.

---

## Compilation and Execution

### Compiling on Windows (MinGW-w64)
Open a terminal in the folder containing your C source file and compile:
```powershell
gcc -Wall -Wextra -std=c11 program.c -o program.exe
.\program.exe
```

### Compiling on Linux or macOS
```bash
gcc -Wall -Wextra -std=c11 program.c -o program
./program
```

### Passing Input Files
For programs that read large amounts of test data:
```bash
./program < input.txt
```

---

## Best Practices and Common Pitfalls

* **Buffer Overflows:** Always bound input reading using `fgets()` or sized specifiers like `%19s` instead of unsafe routines like `gets()`.
* **Format Specifiers:** Match types strictly (`%d` for `int`, `%ld` for `long`, `%f` for `float`, `%lf` for `double`).
* **Pointer Dereferencing:** Always verify that dynamically allocated pointers returned by `malloc()` are non-NULL before dereferencing.
* **Header Inclusions:** Include `<stdio.h>`, `<stdlib.h>`, `<string.h>`, and `<math.h>` when appropriate. Note that when using `<math.h>` on Linux, link with `-lm` (e.g., `gcc file.c -lm`).

---

## Detailed Documentation

For full problem statements, inputs, and expected output specifications across all laboratory units, refer to [docs/SYLLABUS_AND_LABS.md](./docs/SYLLABUS_AND_LABS.md).
