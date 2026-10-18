# Teaching Assistantship (TA) Resource Repository

Centralized academic repository containing laboratory manuals, lecture slide decks, syllabus planning documents, and reference source code implementations for Teaching Assistantship (TA) courses within the Department of Computer Science and Engineering.

---

## Subject Catalog

| Directory | Course Code | Course Title | Target Program and Semester | Primary Stack | Documentation |
| :--- | :--- | :--- | :--- | :--- | :--- |
| [TA-C](./TA-C) | 2301CS101 | Computer Programming using C | B.Tech CSE & B.Sc (Honours), Semester 1 | C (C99 / C11, GCC) | [TA-C README](./TA-C/README.md) |
| [TA-GT](./TA-GT) | 2301CS595 | Graph Theory | B.Tech CSE, Semester 5 (Open Elective) | C (Graph Algorithms) | [TA-GT README](./TA-GT/README.md) |
| [TA-OOPJ](./TA-OOPJ) | 2301CS362 / 2605CS102 | Object Oriented Programming using Java | B.Tech D2D (Sem 3) & MCA (Sem 1) | Java (SE 17+), C | [TA-OOPJ README](./TA-OOPJ/README.md) |
| [TA-Python](./TA-Python) | 2301CS404 | Python Programming | B.Tech CSE, Semester 4 (AY 2025-26) | Python 3.10+, Jupyter | [TA-Python README](./TA-Python/README.md) |

---

## Repository Architecture

```text
TA/
|-- .gitattributes              # Line ending normalization rules
|-- .gitignore                  # Multi-language build artifact exclusion rules
|-- LICENSE                     # MIT License terms
|-- README.md                   # Global repository documentation
|
|-- TA-C/                       # C Programming Laboratory Track
|   |-- LAB_Manual_C_2025_V2.pdf# Course practical list and manual (11 units)
|   |-- README.md               # Track overview and compilation instructions
|   `-- docs/
|       `-- SYLLABUS_AND_LABS.md# Unit-by-unit problem breakdowns
|
|-- TA-GT/                      # Graph Theory Laboratory Track
|   |-- GT-Lab-Final.pdf        # Lab practical syllabus and 15 experiment definitions
|   |-- code_GT/                # Reference C implementations for GT algorithms
|   |-- Programs/               # Source implementations and algorithm benchmarks
|   |-- README.md               # Track overview, theory background, and build commands
|   `-- docs/
|       `-- ALGORITHMS_AND_LABS.md # Theoretical mapping and algorithmic descriptions
|
|-- TA-OOPJ/                    # Object Oriented Programming in Java Track
|   |-- Programs_D2D/           # Diploma-to-Degree (D2D) syllabus track (Labs 1-15)
|   |   `-- D2D_PracticalList_OOP_2026.pdf
|   |-- Programs_MCA/           # MCA syllabus track (Labs 1-30)
|   |   `-- MCA_PracticalList_OOP_2026.pdf
|   |-- README.md               # Java track guide, package guidelines, compile commands
|   `-- docs/
|       `-- LAB_INDEX.md        # Comprehensive index of D2D and MCA lab problems
|
`-- TA-Python/                  # Python Programming Track
    |-- Docs/                   # Official syllabus, lab planning, and topic guides
    |-- Labs/                   # Completed interactive lab notebooks (Labs 1-15)
    |-- New_Labs/               # Supplementary and revised lab notebooks
    |-- PPT/                    # Lecture slide presentations (Units 1 to 5)
    |-- README.md               # Track overview, setup guide, and notebook index
    `-- docs/
        `-- LAB_EXERCISES.md    # Detailed problem mapping for each Python lab
```

---

## Track Summaries

### 1. Computer Programming using C (TA-C)
* **Target Audience:** First-year engineering undergraduate students.
* **Core Topics:** Syntax fundamentals, conditional operators, nested decision structures, looping constructs (while, for, nested loops), single-dimensional and two-dimensional arrays, user-defined functions, string operations, pointers, structure definitions, and file stream input/output.
* **Key Artifacts:** Official 11-page laboratory manual containing graded practical assignments (Sections A, B, and C).

### 2. Graph Theory (TA-GT)
* **Target Audience:** Third-year engineering undergraduate students (Semester 5).
* **Core Topics:** Graph representations (Adjacency List, Adjacency Matrix, Degree Matrix, Laplacian Matrix), tree characterization, center and eccentricity calculations, cut-vertices and articulation points, edge and vertex connectivity, fundamental cut-sets and circuits, maximal and perfect bipartite matching, Hall's Marriage Condition verification, spectral clustering via graph Laplacian, and Floyd-Warshall all-pairs shortest paths.
* **Key Artifacts:** Experiment manual covering 15 structured laboratory assignments with reference C implementations.

### 3. Object Oriented Programming using Java (TA-OOPJ)
* **Target Audience:** Diploma-to-Degree (D2D Sem-3) and Master of Computer Applications (MCA Sem-1) students.
* **Core Topics:** Procedural transition (C review in Lab 1), Java primitive types, object and class design, constructors, method overloading, single and multilevel inheritance, dynamic method dispatch, abstract classes, interface contracts, user-defined exception handling, multithreading and thread synchronization, Producer-Consumer synchronization patterns, character and byte streams (java.io), and the Java Collections Framework (List, Set, Map, Comparable/Comparator).
* **Key Artifacts:** Dual-track directories (`Programs_D2D` with 15 labs and `Programs_MCA` with 30 labs) accompanied by institutional practical list documents.

### 4. Python Programming (TA-Python)
* **Target Audience:** Second-year engineering undergraduate students (Semester 4).
* **Core Topics:** Python runtime environment, dynamic typing, numeric formatting, string slicing and manipulation, collection data structures (Lists, Tuples, Sets, Dictionaries), comprehension syntax, functions, modular architecture (`Calculator.py`), persistent file handling, structured exception handling, and object-oriented programming.
* **Key Artifacts:** Full lecture slide decks (Units 1 to 5), institutional lab planning spreadsheet, syllabus specification, and 15 interactive Jupyter notebooks with verified sample outputs and test data assets.

---

## Prerequisites and Environment Setup

### C Toolchain
* **Compiler:** GCC (MinGW-w64 on Windows, or standard GCC on Linux/macOS)
* **Verification:**
  ```bash
  gcc --version
  ```

### Java Development Kit
* **JDK:** OpenJDK 17 or higher
* **Verification:**
  ```bash
  javac -version
  java -version
  ```

### Python Environment
* **Runtime:** Python 3.10 or higher
* **Recommended Packages:** Jupyter Notebook or JupyterLab
* **Installation:**
  ```bash
  python -m pip install --upgrade pip
  python -m pip install notebook jupyterlab
  ```

---

## Compilation and Execution Guide

### C Programs (TA-C / TA-GT)
Compile with standard warnings enabled:
```bash
gcc -Wall -Wextra -O2 <filename>.c -o <output_binary>
./<output_binary>
```

On Windows PowerShell:
```powershell
gcc -Wall -Wextra <filename>.c -o <output_binary>.exe
.\<output_binary>.exe
```

### Java Programs (TA-OOPJ)
Navigate to the specific lab directory containing the Java source:
```bash
cd TA-OOPJ/Programs_MCA/LAB-5
javac Program1.java
java Program1
```

For programs with dependent classes in the same directory:
```bash
javac *.java
java Program1
```

### Python Notebooks (TA-Python)
Launch Jupyter from the `TA-Python` directory:
```bash
cd TA-Python
jupyter notebook
```
Navigate to `Labs/` and select any notebook (`.ipynb`) to execute cells sequentially.

---

## Repository Hygiene and Git Configuration

To maintain repository cleanliness and avoid committing transient or platform-specific files:

1. **Ignored Artifacts:**
   * Compiled C binaries (`*.exe`, `*.out`, `*.o`, `*.obj`)
   * Compiled Java bytecode (`*.class`) and Java archive packages (`*.jar`, `*.war`)
   * Python bytecode cache (`__pycache__/`, `*.pyc`) and virtual environment folders (`.venv/`, `env/`)
   * Jupyter checkpoint folders (`.ipynb_checkpoints/`)
   * Operating system metadata files (`.DS_Store`, `Thumbs.db`, `desktop.ini`)
   * Editor-specific folders (`.vscode/`, `.idea/`)

2. **Line Ending Consistency:**
   * Text files are normalized using `.gitattributes` (`* text=auto`).

3. **Status Check:**
   ```bash
   git status
   ```

---

## Academic Integrity and Usage

These materials are organized for educational instruction, laboratory evaluation, and reference demonstrations. Students utilizing this repository are encouraged to understand the underlying logic, algorithm designs, and language mechanics rather than directly duplicating code for academic submissions.

---

## License

This repository is distributed under the terms of the [MIT License](./LICENSE). Refer to the `LICENSE` file for details.
