#include <stdio.h>
#define MAX 10

// Perform DFS traversal
void dfs(int graph[MAX][MAX], int visited[MAX], int vertex, int vertices)
{
    visited[vertex] = 1;
	int i = 0;
    for (i = 0; i < vertices; i++)
    {
        if (graph[vertex][i] == 1 && !visited[i])
        {
            dfs(graph, visited, i, vertices);
        }
    }
}

// Check whether graph is connected
int isConnected(int graph[MAX][MAX], int vertices)
{
    int visited[MAX] = {0}, i = 0;

    dfs(graph, visited, 0, vertices);
	
    for (i = 0; i < vertices; i++)
    {
        if (!visited[i])
        {
            return 0;
        }
    }
    return 1;
}

void main()
{
    int vertices, i = 0, j = 0, row = 0, col = 0;

    printf("Enter number of vertices: ");
    scanf("%d", &vertices);

    int edges[50][2] = {0};
    int edgeIndex = 0;

    int adjMatrix[MAX][MAX];

    // Input adjacency matrix
    printf("Enter adjacency matrix:\n");
    for (i = 0; i < vertices; i++)
    {
        for (j = 0; j < vertices; j++)
        {
            scanf("%d", &adjMatrix[i][j]);
        }
    }

    // Stop if graph is already disconnected
    if (!isConnected(adjMatrix, vertices))
    {
        printf("Graph is already disconnected.\n");
        return;
    }

    // Store all graph edges
    for (i = 0; i < vertices; i++)
    {
        for (j = i + 1; j < vertices; j++)
        {
            if (adjMatrix[i][j] == 1)
            {
                edges[edgeIndex][0] = i;
                edges[edgeIndex][1] = j;
                edgeIndex++;
            }
        }
    }

    // Display extracted edges
    printf("Edges:\n");
    for (i = 0; i < edgeIndex; i++)
    {
        printf("%d - %d\n", edges[i][0], edges[i][1]);
    }
    printf("\n");

    int minEdges = edgeIndex + 1;
    int comboSize = 1 << edgeIndex;
    int combinations[comboSize][edgeIndex];

    // Generate all edge combinations
    for (i = 0; i < comboSize; i++)
    {
        for (j = 0; j < edgeIndex; j++)
        {
            combinations[i][j] = -1;
        }

        int number = i;
        int binary[edgeIndex];
        int binaryIndex = edgeIndex - 1;

        for (j = 0; j < edgeIndex; j++)
        {
            binary[j] = 0;
        }

        // Convert number to binary
        while (number > 0)
        {
            int remainder = number % 2;
            binary[binaryIndex] = remainder;
            binaryIndex--;
            number /= 2;
        }

        // Store selected edge indices
        for (j = 0; j < edgeIndex; j++)
        {
            if (binary[j] == 1)
            {
                combinations[i][j] = j;
            }
        }
    }
    
    // Check connectivity after removing each edge combination
    for (i = 0; i < comboSize; i++)
    {
        int tempGraph[MAX][MAX] = {0};

        // Copy original graph
        for (row = 0; row < vertices; row++)
        {
            for (col = 0; col < vertices; col++)
            {
                tempGraph[row][col] = adjMatrix[row][col];
            }
        }

        // Remove selected edges
        for (j = 0; j < edgeIndex; j++)
        {
            if (combinations[i][j] != -1)
            {
                int source = edges[combinations[i][j]][0];
                int destination = edges[combinations[i][j]][1];

                tempGraph[source][destination] = 0;
                tempGraph[destination][source] = 0;
            }
        }

        int removedEdges = 0;

        // Print edge sets that disconnect the graph
        if (!isConnected(tempGraph, vertices))
        {
            for (j = 0; j < edgeIndex; j++)
            {
                if (combinations[i][j] != -1)
                {
                    removedEdges++;

                    int source = edges[combinations[i][j]][0];
                    int destination = edges[combinations[i][j]][1];

                    printf("{%d, %d}, ", source, destination);
                }
            }
            printf("\n");
        }

        // Update minimum edge cut
        if (minEdges > removedEdges && removedEdges != 0)
        {
            minEdges = removedEdges;
        }
    }

    printf("Edge Connectivity : %d", minEdges);
}
