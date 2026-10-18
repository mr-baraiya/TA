#include <stdio.h>

#define V 6
#define CHORDS 3

// DFS
void DFS(int graph[V][V], int visited[], int v)
{
    visited[v] = 1;
	int i = 0;
    for(i = 0; i < V; i++)
    {
        if(graph[v][i] && !visited[i])
            DFS(graph, visited, i);
    }
}

// Connectivity
int isConnected(int graph[V][V])
{
    int visited[V] = {0}, i = 0;

    DFS(graph, visited, 0);

    for(i = 0; i < V; i++)
    {
        if(!visited[i])
            return 0;
    }

    return 1;
}

void main()
{
    // Original Graph
    int graph[V][V] =
    {
        {0,1,1,0,0,0},
        {1,0,1,1,0,0},
        {1,1,0,0,1,0},
        {0,1,0,0,1,1},
        {0,0,1,1,0,1},
        {0,0,0,1,1,0}
    };

    // Spanning Tree
    int tree[V][V] =
    {
        {0,1,0,0,0,0},
        {1,0,1,1,0,0},
        {0,1,0,0,0,0},
        {0,1,0,0,1,1},
        {0,0,0,1,0,0},
        {0,0,0,1,0,0}
    };

    // Branches
    int branches[5][2] = {{0,1}, {1,2}, {1,3}, {3,4}, {3,5}};
    int branchCount = 5;

    // Chords
    int chords[3][2] = {{0,2}, {2,4}, {4,5}};
    int chordCount = 3;
    
	// Chord Combinations
    int combination[8][CHORDS][2] =
	{
	    {{0,0}},                          // Combination 0 (empty set)
	    {{0,2}},                          // Combination 1
	    {{2,4}},                          // Combination 2
	    {{4,5}},                          // Combination 3
	    {{0,2},{2,4}},                    // Combination 4
	    {{0,2},{4,5}},                    // Combination 5
	    {{2,4},{4,5}},                    // Combination 6
	    {{0,2},{2,4},{4,5}}               // Combination 7
	};
	int size[8] = {0, 1, 1, 1, 2, 2, 2, 3};
	int totalComb = 8;
	int i = 0, j = 0, k = 0, b = 0, c = 0;
	
    // Print Branches
    printf("Branches:\n");
    for(i = 0; i < branchCount; i++)
    {
        printf("(%d,%d)\n", branches[i][0], branches[i][1]);
    }

    // Print Chords
    printf("\nChords:\n");
    for(i = 0; i < chordCount; i++)
    {
        printf("(%d,%d)\n", chords[i][0], chords[i][1]);
    }

    // Print Chord Combinations
    printf("\nChord Combinations:\n");
    for(i = 0; i < totalComb; i++)
    {
        printf("%2d : ", i + 1);
        for(j = 0; j < size[i]; j++)
        {
            printf("(%d,%d) ", combination[i][j][0], combination[i][j][1]);
        }
        printf("\n");
    }

    printf("\nFundamental Cut Sets:\n");
    //	Fundamental Cut Sets

    for(b = 0; b < branchCount; b++)
    {
        for(c = 0; c < totalComb; c++)
        {
            int temp[V][V];

            // Copy original graph
            for(i = 0; i < V; i++)
            {
                for(j = 0; j < V; j++)
                {
                    temp[i][j] = graph[i][j];
                }
            }

            // Remove the current branch
            int u = branches[b][0];
            int v = branches[b][1];

            temp[u][v] = 0;
            temp[v][u] = 0;

            // Remove all chords in the current combination
            for(k = 0; k < size[c]; k++)
            {
                int x = combination[c][k][0];
                int y = combination[c][k][1];

                temp[x][y] = 0;
                temp[y][x] = 0;
            }

            // Check connectivity
            if(!isConnected(temp))
            {
                printf("{ ");

                printf("(%d,%d) ", u, v);

                for(k = 0; k < size[c]; k++)
                {
                    printf("(%d,%d) ", combination[c][k][0], combination[c][k][1]);
                }

                printf("}\n");
                break;
            }
        }
    }
}
