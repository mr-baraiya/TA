# Algorithmic Foundations and Laboratory Guide: Graph Theory (2301CS595)

This document provides mathematical formulations, algorithmic logic, problem statements, and execution profiles for the laboratory experiments in **2301CS595 - Graph Theory**.

---

## Academic Information

* **Course Code:** 2301CS595
* **Semester:** B.Tech Semester 5 (Open Elective)
* **Examination Scheme:** SEE Theory: 40, CIA Theory: 30, SEE Practical: 20, CIA Practical: 10 (Total: 100 Marks)
* **Core Reference Literature:**
  * Narsingh Deo, *Graph Theory with Applications to Engineering and Computer Science*, Prentice Hall India.
  * Douglas B. West, *Introduction to Graph Theory*, Pearson Education.

---

## Detailed Lab Specifications and Theoretical Models

### Lab 1: Graph Representation and Fundamental Properties

#### Theoretical Formulation
* **Undirected Graph:** An ordered pair `G = (V, E)` where `V` is a set of vertices and `E` is a set of unordered pairs of vertices.
* **Adjacency Matrix `A`:** A `|V| x |V|` binary matrix where:
  * `A[i][j] = 1` if `(v_i, v_j) in E`, and `0` otherwise.
* **Adjacency List:** An array of lists where the `i`-th list contains all neighbors adjacent to vertex `v_i`.
* **Degree `deg(v)`:** The number of edges incident to `v`. In an undirected simple graph, `sum_{v in V} deg(v) = 2|E|` (Handshaking Lemma).

#### Lab Problems
1. Implement adjacency list representation for a directed graph given vertex count `V` and edge array `edges[][]`.
2. Construct both Adjacency Matrix and Adjacency List for an undirected graph, calculate vertex degrees, and determine whether the graph is simple, complete (`|E| = V*(V-1)/2`), or connected.

---

### Lab 2 & Lab 3: Graph Traversal - Breadth First Search (BFS) and Depth First Search (DFS)

#### Breadth First Search (BFS)
* **Strategy:** Queue-based (FIFO) exploration discovering all vertices at distance `k` before visiting distance `k + 1`.
* **Complexity:** Time `O(V + E)`, Space `O(V)`.
* **Output:** Level-order vertex sequence and shortest hop distance in unweighted graphs.

#### Depth First Search (DFS)
* **Strategy:** Stack-based (LIFO or recursion) exploration following paths to their terminus before backtracking.
* **Complexity:** Time `O(V + E)`, Space `O(V)`.
* **Applications:** Connected component labeling, cycle detection, topological sorting, and discovery of bridges/articulation points.

---

### Lab 4: Tree Characterization and Center Finding

#### Theoretical Definitions
* **Tree:** A connected, acyclic graph. Key properties:
  1. Exactly `|E| = |V| - 1`.
  2. Exactly one unique simple path between any pair of vertices.
* **Pendant (Leaf) Vertex:** Any vertex with `deg(v) == 1`.
* **Distance `d(u, v)`:** Length of the shortest path between `u` and `v`.
* **Eccentricity `e(v)`:** Maximum distance from vertex `v` to any other vertex:
  `e(v) = max_{u in V} d(u, v)`.
* **Radius `r(G)`:** Minimum eccentricity: `r(G) = min_{v in V} e(v)`.
* **Diameter `D(G)`:** Maximum eccentricity: `D(G) = max_{v in V} e(v)`.
* **Center of Tree:** The vertex (or pair of adjacent vertices) whose eccentricity equals the radius `r(G)`. Every tree has either 1 or 2 center vertices (Jordan's Theorem, 1869).

#### Algorithm to Find Tree Center
1. Compute all-pairs shortest path matrix `dist[V][V]` using BFS or Floyd-Warshall.
2. For each vertex `i`, calculate `eccentricity[i] = max_{j} dist[i][j]`.
3. Determine `min_ecc = min_i eccentricity[i]`.
4. Output all vertices having `eccentricity[i] == min_ecc`.

---

### Lab 5: Spanning Trees, Fundamental Circuits, and Rank/Nullity

#### Theoretical Framework
* **Spanning Tree `T`:** A subgraph of connected graph `G` that contains all vertices of `G` and is a tree.
* **Branches:** Edges of `G` that belong to spanning tree `T`. Total branches = `|V| - 1`.
* **Chords (Links):** Edges of `G` that do not belong to `T` (`E - E(T)`).
* **Rank `r(G)`:** `r(G) = |V| - k`, where `k` is the number of connected components. For a connected graph (`k = 1`), `r(G) = |V| - 1`.
* **Nullity `mu(G)` (Cyclomatic Number):** `mu(G) = |E| - |V| + k`. For a connected graph, `mu(G) = |E| - |V| + 1`.
* **Fundamental Circuit:** Adding any chord `e` to tree `T` forms exactly one unique cycle. For `mu(G)` chords, there are exactly `mu(G)` fundamental circuits.

#### Friend Circles Problem
Given an adjacency matrix representing direct friendships, calculate total connected components using DFS/BFS or Disjoint Set Union (DSU).

---

### Lab 6 & Lab 7: Connectivity, Articulation Points, and Fundamental Cut-Sets

#### Articulation Point (Cut-Vertex)
A vertex `v` whose removal increases the number of connected components of `G`. Computed using Tarjan's bridge and articulation point algorithm via DFS discovery times `tin[v]` and low-link values `low[v]`.

#### Connectivity Metrics
* **Vertex Connectivity `kappa(G)`:** Minimum number of vertices whose removal disconnects `G` or reduces it to a single vertex.
* **Edge Connectivity `lambda(G)`:** Minimum number of edges whose removal disconnects `G`.
* **Whitney's Inequality:** For every graph `G`, `kappa(G) <= lambda(G) <= min_deg(G)`.

#### Fundamental Cut-Set
Let `T` be a spanning tree of `G`. Removing any single branch `b in T` partitions the tree into two disjoint vertex subsets `V_1` and `V_2`. The set of all edges in `G` having one endpoint in `V_1` and the other in `V_2` constitutes a fundamental cut-set with respect to branch `b`.

---

### Lab 8 & Lab 9: Dominating Sets and Domination Numbers

#### Definitions
* **Dominating Set `D subseteq V`:** A subset of vertices such that every vertex `v in V \setminus D` is adjacent to at least one vertex in `D`.
* **Domination Number `gamma(G)`:** The cardinality of the smallest dominating set in `G`.
* **Total Dominating Set `D_t subseteq V`:** A subset such that every vertex in `V` (including vertices within `D_t`) is adjacent to at least one vertex in `D_t`. (Requires that `G` contains no isolated vertices).
* **Total Domination Number `gamma_t(G)`:** The cardinality of the smallest total dominating set.

#### Implementation in `code_GT/Lab_8_Dominant_Set.c`
The program enumerates candidate subsets using bitmask combinations `(1 << n)`, verifying neighborhood coverage:
```c
// Condition for dominating set:
// For every vertex v: either v in D or exists u in D such that (u, v) in E.
```

---

### Lab 10: Graph Matching Algorithms

#### Definitions
* **Matching `M subseteq E`:** A set of edges without common vertices (no two edges share an endpoint).
* **Maximal Matching:** A matching that cannot be enlarged by adding any additional edge without violating the matching property.
* **Maximum Matching:** A matching of maximum cardinality among all matchings of `G`.
* **Perfect Matching:** A matching that saturates every vertex in `V` (`|M| = |V| / 2`).

#### Files
* `code_GT/maxiaml_matching.c`: Greedy selection of independent edges.
* `code_GT/perfect_matching.c`: Verifies whether computed matching saturates all vertices.

---

### Lab 11: Hall's Marriage Condition

#### Theorem (Philip Hall, 1935)
Let `G = (X, Y; E)` be a bipartite graph. A matching saturating all vertices of `X` exists if and only if for every subset `S subseteq X`:
```text
|N(S)| >= |S|
```
where `N(S)` denotes the collective neighborhood of vertices in `S`:
`N(S) = bigcup_{u in S} N(u)`.

#### Implementation Logic (`code_GT/halls_condition.c`)
1. Extract size of set `X` (`n_X`) and set `Y` (`n_Y`).
2. Iterate through all `2^{n_X} - 1` non-empty subsets of `X` using bit manipulation.
3. Compute bitwise union of neighbor arrays for vertices in subset `S`.
4. Count total distinct neighbors `|N(S)|`.
5. If for any subset `|N(S)| < |S|`, condition fails and matching is impossible.
6. If all subsets satisfy `|N(S)| >= |S|`, Hall's Condition holds.

---

### Lab 12: Associated Matrices of Graphs

#### Mathematical Formulation (`code_GT/adj_deg_lap_mat.c`)
Given a simple undirected graph with `n` vertices:
1. **Adjacency Matrix `A` (`n x n`):**
   * `A[i][j] = 1` if edge `(i, j) in E`, else `0`.
2. **Degree Matrix `D` (`n x n`):**
   * Diagonal matrix where `D[i][i] = deg(v_i) = sum_{j=0}^{n-1} A[i][j]`, and `D[i][j] = 0` for `i != j`.
3. **Combinatorial Laplacian Matrix `L` (`n x n`):**
   * `L = D - A`
   * Entry-wise:
     * `L[i][i] = deg(v_i)`
     * `L[i][j] = -1` if `(i, j) in E` and `i != j`
     * `L[i][j] = 0` if `(i, j) notin E` and `i != j`

#### Properties of Laplacian `L`
* `L` is symmetric and positive semi-definite.
* Every row sum and column sum of `L` is zero (`L * 1 = 0`).
* The smallest eigenvalue is always `lambda_1 = 0` with corresponding eigenvector `1`.
* The multiplicity of eigenvalue `0` equals the number of connected components in `G`.

---

### Lab 13 & Lab 14: Spectral Analysis and Spectral Graph Clustering

#### Spectral Clustering Protocol
1. Construct Adjacency Matrix `A` and Degree Matrix `D`.
2. Compute Laplacian Matrix `L = D - A`.
3. Calculate the eigenvalues `0 = lambda_1 <= lambda_2 <= ... <= lambda_n`.
4. Identify the **Fiedler Value** (`lambda_2`), also known as algebraic connectivity.
5. Extract the **Fiedler Vector** `v_2` (eigenvector corresponding to `lambda_2`).
6. Partition vertices into clusters based on the sign of their component in `v_2`:
   * Cluster 1: `{ v_i | v_2[i] >= 0 }`
   * Cluster 2: `{ v_i | v_2[i] < 0 }`

---

### Lab 15: Floyd-Warshall All-Pairs Shortest Path Algorithm

#### Formulation (`code_GT/floyd_warshall.c`)
* **State Definition:** `dist[i][j]` is the length of the shortest path from vertex `i` to vertex `j` using intermediate vertices from set `{0, 1, ..., k}`.
* **Recurrence Relation:**
  ```text
  dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
  ```
* **Complexity:** Time `O(V^3)`, Space `O(V^2)`.
* **Initialization:**
  * `dist[i][i] = 0`
  * `dist[i][j] = weight(i, j)` if `(i, j) in E`
  * `dist[i][j] = INF` if `(i, j) notin E`
