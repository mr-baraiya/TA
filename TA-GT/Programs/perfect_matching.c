#include <stdio.h>

#define E 5
#define V 6
#define M 13

int edges[E][2] =
{
    {0, 3},
    {0, 4},
    {1, 4},
    {1, 5},
    {2, 5}
};

int matchings[M][E] =
{
    {-1, -1, -1, -1, -1},
    
    {0, -1, -1, -1, -1},
    {1, -1, -1, -1, -1},
    {2, -1, -1, -1, -1},
    {3, -1, -1, -1, -1},
    {4, -1, -1, -1, -1},

    {0, 2, -1, -1, -1},
    {0, 3, -1, -1, -1},
    {0, 4, -1, -1, -1},
    {1, 3, -1, -1, -1},
    {1, 4, -1, -1, -1},
    {2, 4, -1, -1, -1},

    {0, 2, 4, -1, -1}
};

void printMatching(int index)
{
    int j;
    printf("{ ");
    for(j = 0; j < E; j++)
    {
        if(matchings[index][j] != -1)
        {
            printf("%d ", matchings[index][j]);
        }
    }

    printf("}");
}

void findPerfectMatching()
{
    int i, j;
    int edgeIndex;
    int start, end;
    int freq[V];
    int perfect;
    for(i = 0; i < M; i++)
    {    
		for(j = 0; j < V; j++)
        {
            freq[j] = 0;
        }

        for(j = 0; j < E; j++)
        {
            if(matchings[i][j] != -1)
            {
                edgeIndex = matchings[i][j];

                start = edges[edgeIndex][0];
                end = edges[edgeIndex][1];

                freq[start]++;
                freq[end]++;
            }
        }
        perfect = 1;
        for(j = 0; j < V; j++)
        {
            if(freq[j] != 1)
            {
                perfect = 0;
                break;
            }
        }
        if(perfect == 1)
        {
            printMatching(i);
            printf("\n");
        }
    }
}

void main()
{
    findPerfectMatching();
}
