# Python Programming (Course Code: 2301CS404)

This directory contains laboratory assignments, Jupyter notebooks, syllabus documentation, reference lecture presentations, and test datasets for the **Python Programming** course offered to Bachelor of Technology (B.Tech) Computer Science and Engineering students in Semester 4 (Academic Year 2025-26).

---

## Course Overview

* **Course Code:** 2301CS404
* **Course Title:** Python Programming
* **Target Audience:** B.Tech CSE, Semester 4
* **Academic Year:** 2025-26
* **Primary Language:** Python 3 (3.10+)
* **Environment:** Jupyter Notebook / JupyterLab / Visual Studio Code

---

## Directory Organization

```text
TA-Python/
|-- README.md                         # Track guide and setup instructions
|-- docs/
|   `-- LAB_EXERCISES.md              # Detailed problem statements for Labs 1 to 15
|
|-- Docs/                             # Institutional syllabus and guides
|   |-- 2301CS404-Python-Lab Manual.pdf # Official 6-page laboratory manual
|   |-- 2301CS404-Python-Lab Planning-AY-2025-26_to_Upload_UMS.xlsx
|   |-- Subject_Syllabus2301CS404.pdf # Complete course syllabus and teaching scheme
|   |-- Python Setup .pdf             # Installation and environment setup walkthrough
|   |-- String.pdf / String.docx      # Deep-dive study guide on string manipulation
|   |-- Tuple.pdf                     # Study guide on tuples and sequence packing
|   |-- Set.pdf                       # Study guide on sets and mathematical set operations
|   `-- Dictionary.pdf                # Study guide on dictionaries and key-value mapping
|
|-- Labs/                             # Interactive Laboratory Notebooks & Test Data
|   |-- Lab-1_Vishal_Baraiya_Python Programming - Lab - 1.ipynb
|   |-- ...
|   |-- Lab-15_Vishal_Baraiya_Python Programming - Lab - 15.ipynb
|   |-- Calculator.py                 # Modular math operations library
|   `-- *.txt                         # Test files for file handling experiments
|
|-- New_Labs/                         # Revised and updated laboratory notebooks
|   |-- Python Programming - Lab - 2.ipynb
|   `-- Python Programming - Lab - 3.ipynb
|
`-- PPT/                              # Theoretical Lecture Presentation Slides
    |-- Unit-1.pptx                   # Introduction to Python, variables, basic I/O
    |-- Unit-2.pptx                   # Control structures, branching, loops
    |-- Unit-3.pptx                   # Data structures (Strings, Lists, Tuples, Sets, Dicts)
    |-- Unit-4.pptx                   # Functions, scope, modules, and file handling
    `-- Unit-5.pptx                   # Object-Oriented Programming and Exception Handling
```

---

## Laboratory Curriculum Matrix

| Lab Notebook | Primary Topics Covered | Key Methods / Concepts |
| :--- | :--- | :--- |
| **Lab 1** | Python Introduction & Interactive Environment | `print()`, basic arithmetic, dynamic typing, comments |
| **Lab 2** | Variables, Data Types, and Operators | Formatted strings (`f-strings`), type casting, arithmetic operators |
| **Lab 3** | Conditional Statements & Branching | `if`, `elif`, `else`, nested conditions, leap year check |
| **Lab 4** | Iteration with While and For Loops | `range()`, `while`, `for`, `break`, `continue`, `pass` |
| **Lab 5** | Mathematical Computations & Patterns | Prime checks, Armstrong numbers, factorial, asterisk patterns |
| **Lab 6** | String Slicing and String Methods | String indexing, slicing `[start:stop:step]`, `split()`, `join()`, `replace()` |
| **Lab 7** | Lists and List Comprehensions | List methods (`append`, `extend`, `pop`, `sort`), list comprehensions |
| **Lab 8** | Tuples and Sets | Immutability, tuple unpacking, set union, intersection, difference |
| **Lab 9** | Dictionaries and Hash Mapping | Key-value pairs, dictionary methods (`keys`, `values`, `items`, `get`) |
| **Lab 10** | User-Defined Functions & Lambdas | `def`, default arguments, `*args`, `**kwargs`, lambda functions |
| **Lab 11** | Modular Programming & Packages | Creating modules, `import`, importing from `Calculator.py` |
| **Lab 12** | File Input/Output Operations | `open()`, reading lines, writing, appending, word counting |
| **Lab 13** | Exception Handling Architecture | `try`, `except`, `else`, `finally`, `raise`, custom exceptions |
| **Lab 14** | Object-Oriented Programming Basics | Classes, `__init__()`, instance variables, methods, `self` |
| **Lab 15** | Advanced OOP & Inheritance | Single/multilevel inheritance, `super()`, method overriding, polymorphism |

---

## File Handling Test Data Assets (`Labs/`)

The following files are utilized by **Lab 12** and **Lab 13** for file streaming and text parsing demonstrations:

* `article.txt`: Sample multiline article text for word frequency and paragraph counting.
* `wordcount.txt`: Input text for counting unique words, whitespace, and character statistics.
* `primenumbers.txt`: Numeric stream containing prime numbers for parsing and filtering.
* `scores.txt`: Delimited records of student test scores for average computation.
* `purchases.txt`: Transaction records for tabular aggregation and expense analysis.
* `summary.txt` / `merged.txt` / `demo-copy.txt`: Output targets for file copy and concatenation tasks.

---

## Environment Setup and Running Notebooks

### 1. Installing Python and Jupyter
Ensure Python 3.10+ is installed on your system. Install Jupyter using pip:
```bash
python -m pip install --upgrade pip
python -m pip install notebook
```

### 2. Launching Jupyter Notebook
Open a terminal in the `TA-Python` directory and start the notebook server:
```bash
cd TA-Python
jupyter notebook
```
A browser window will open automatically. Navigate to `Labs/` to open and execute any `.ipynb` notebook.

### 3. Executing Modular Python Scripts
To test standalone modules like `Calculator.py`:
```bash
python Labs/Calculator.py
```

---

## Clean Repository Rules

* Generated `.ipynb_checkpoints` folders are strictly excluded via the root `.gitignore`.
* Python bytecode cache (`__pycache__/`, `*.pyc`) is automatically ignored.
* Always clear notebook cell outputs if instructed before submitting assignments, or ensure committed notebooks contain verified demonstration outputs.

---

## Detailed Lab Exercise Specifications

For full problem statements, sample inputs, expected outputs, and solution guidelines for all 15 Python labs, see [docs/LAB_EXERCISES.md](./docs/LAB_EXERCISES.md).
