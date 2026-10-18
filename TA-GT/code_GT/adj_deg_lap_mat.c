#include <stdio.h>

void main()
{
    int n, m;
    int i, j, u, v;

    printf("Enter number of vertices: ");
    scanf("%d", &n);
    
    int adj[n][n];
    int degree[n][n];
    int laplacian[n][n];

    // Initialize matrices with 0
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            adj[i][j] = 0;
            degree[i][j] = 0;
            laplacian[i][j] = 0;
        }
    }

    printf("Enter number of edges: ");
    scanf("%d", &m);

    printf("Enter edges:\n");

    for (i = 0; i < m; i++)
    {
        scanf("%d %d", &u, &v);

        adj[u][v] = 1;
        adj[v][u] = 1;
    }

    printf("\nAdjacency Matrix:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("%d ", adj[i][j]);
        }
        printf("\n");
    }

    for (i = 0; i < n; i++)
	{
	    for (j = 0; j < n; j++)
	    {
	        if (adj[i][j] == 1)
	        {
	            degree[i][i]++;
	        }
	    }
	}

    printf("\nDegree Matrix:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("%d ", degree[i][j]);
        }
        printf("\n");
    }

    // Laplacian Matrix
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            laplacian[i][j] = degree[i][j] - adj[i][j];
        }
    }

    printf("\nLaplacian Matrix:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("%2d ", laplacian[i][j]);
        }
        printf("\n");
    }
}
