# Graph Theory (Course Code: 2301CS595)

This directory contains instructional materials, formal laboratory specifications, and reference C implementations for the **Graph Theory** course offered as an Open Elective to Bachelor of Technology (B.Tech) Computer Science and Engineering students in Semester 5.

---

## Course Information

* **Course Code:** 2301CS595
* **Course Title:** Graph Theory
* **Target Audience:** B.Tech CSE, Semester 5 (Open Elective)
* **Prerequisites:** C Programming Language, Data Structures, Discrete Mathematics
* **Primary Language:** C (C99 / C11)
* **Compiler:** GCC (MinGW-w64 on Windows, standard GCC on Linux)

---

## Directory Organization

| Directory / File | Description |
| :--- | :--- |
| `GT-Lab-Final.pdf` | Official laboratory syllabus defining objectives and problem statements for all 15 practical sessions. |
| `code_GT/` | Reference C source code implementations for core graph theory algorithms and metrics. |
| `Programs/` | Working implementations and development sources. |
| `docs/ALGORITHMS_AND_LABS.md` | In-depth algorithmic documentation, theoretical formulations, input formats, and execution examples. |

---

## Laboratory Experiment Index

The 15 laboratory practicals defined in the curriculum cover fundamental through advanced structural and algebraic graph theory:

1. **Lab 1: Graph Representation and Basic Metrics**
   * Adjacency matrix and adjacency list representation of directed and undirected graphs.
   * Vertex degree calculation, simple/complete/connected property validation.
2. **Lab 2: Breadth First Search (BFS)**
   * Queue-based level-order traversal starting from an arbitrary source vertex.
3. **Lab 3: Depth First Search (DFS)**
   * Recursive and stack-based traversal exploring connected components.
4. **Lab 4: Tree Characterization and Metrics**
   * Identification of pendant (leaf) vertices, eccentricities, vertex distances, and tree centers.
5. **Lab 5: Spanning Trees, Fundamental Circuits, and Rank/Nullity**
   * Spanning tree generation, branch and chord partitioning, fundamental circuits, and verification of `Branches = Rank = V - 1` and `Chords = Nullity = E - V + 1`.
   * Connected component analysis ("Friend Circles").
6. **Lab 6: Articulation Points (Cut-Vertices)**
   * Identifying critical vertices whose removal disconnects the graph.
7. **Lab 7: Connectivity and Fundamental Cut-Sets**
   * Computation of vertex connectivity and edge connectivity.
   * Construction of fundamental cut-sets and classification into separable/non-separable graphs.
8. **Lab 8 & 9: Dominating Sets and Domination Numbers**
   * Finding minimal dominating sets, total dominating sets, domination number `gamma(G)`, and total domination number.
9. **Lab 10: Graph Matching Algorithms**
   * Maximal matching, maximum cardinality matching, and perfect matching determination.
10. **Lab 11: Hall's Marriage Condition**
    * Verification of Hall's Marriage Theorem (`|N(S)| >= |S|` for all `S subseteq X`) in bipartite graphs.
11. **Lab 12: Associated Matrices of Graphs**
    * Construction of Adjacency Matrix `A`, Degree Matrix `D`, and combinatorial Laplacian Matrix `L = D - A`.
12. **Lab 13: Spectral Analysis of Graph Matrices**
    * Computation of eigenvalues and eigenvectors for adjacency and Laplacian matrices.
13. **Lab 14: Spectral Graph Clustering**
    * Graph partitioning into clusters using the Fiedler vector (eigenvector of the second smallest eigenvalue of the Laplacian).
14. **Lab 15: All-Pairs Shortest Paths (Floyd-Warshall)**
    * Dynamic programming computation of shortest path matrix across all vertex pairs.

---

## Source Implementations in `code_GT/`

| File | Associated Lab | Theoretical Concept |
| :--- | :--- | :--- |
| `adj_deg_lap_mat.c` | Lab 12 | Construct Adjacency, Degree, and Laplacian matrices. |
| `floyd_warshall.c` | Lab 15 | All-pairs shortest path matrix using dynamic programming. |
| `halls_condition.c` | Lab 11 | Complete verification of Hall's Condition on bipartite graphs. |
| `halls_condition_template.c` | Lab 11 | Student boilerplate template for Hall's condition. |
| `Lab_7_edge_connectivity.c` | Lab 7 | Edge connectivity computation and bridge detection. |
| `Lab_7_Fundamental_Cut_Set.c` | Lab 7 | Spanning tree chords and fundamental cut-set generation. |
| `Lab_8_Dominant_Set.c` | Lab 8 & 9 | Subsets validation for dominating sets and domination numbers. |
| `maxiaml_matching.c` | Lab 10 | Greedy and augmented maximal matching. |
| `perfect_matching.c` | Lab 10 | Verification of perfect matching in bipartite graph sets. |
| `template_matching_code.c` | Lab 10 | Starter template for graph matching assignments. |

---

## Build and Execution Instructions

### Standard Compilation
Compile any source file from either the `code_GT/` or `Programs/` folder using GCC:

```bash
gcc -Wall -Wextra -std=c99 code_GT/adj_deg_lap_mat.c -o adj_deg_lap_mat
./adj_deg_lap_mat
```

On Windows PowerShell:
```powershell
gcc -Wall -Wextra -std=c99 .\code_GT\adj_deg_lap_mat.c -o adj_deg_lap_mat.exe
.\adj_deg_lap_mat.exe
```

### Running with Redirection
Prepare an `input.txt` file containing the vertex count, edge count, and edge pairs:
```bash
./adj_deg_lap_mat < input.txt
```

---

## Detailed Algorithm Reference

For detailed theoretical definitions, matrix equations, mathematical properties, and line-by-line algorithm descriptions, consult [docs/ALGORITHMS_AND_LABS.md](./docs/ALGORITHMS_AND_LABS.md).
