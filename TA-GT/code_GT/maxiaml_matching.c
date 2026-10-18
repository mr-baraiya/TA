/*
    Left  = {0, 1, 2}
    Right = {3, 4, 5}
*/
#include <stdio.h>

#define E 5
#define V 6

int edges[][2] = {
    {0, 3},
    {0, 4},
    {1, 4},
    {1, 5},
    {2, 5}
};

int combinations[32][5] = {
    {-1,-1,-1,-1,-1},

    {0,-1,-1,-1,-1},
    {1,-1,-1,-1,-1},
    {2,-1,-1,-1,-1},
    {3,-1,-1,-1,-1},
    {4,-1,-1,-1,-1},

    {0,1,-1,-1,-1},
    {0,2,-1,-1,-1},
    {0,3,-1,-1,-1},
    {0,4,-1,-1,-1},
    {1,2,-1,-1,-1},
    {1,3,-1,-1,-1},
    {1,4,-1,-1,-1},
    {2,3,-1,-1,-1},
    {2,4,-1,-1,-1},
    {3,4,-1,-1,-1},

    {0,1,2,-1,-1},
    {0,1,3,-1,-1},
    {0,1,4,-1,-1},
    {0,2,3,-1,-1},
    {0,2,4,-1,-1},
    {0,3,4,-1,-1},
    {1,2,3,-1,-1},
    {1,2,4,-1,-1},
    {1,3,4,-1,-1},
    {2,3,4,-1,-1},

    {0,1,2,3,-1},
    {0,1,2,4,-1},
    {0,1,3,4,-1},
    {0,2,3,4,-1},
    {1,2,3,4,-1},

    {0,1,2,3,4}
};

int arr[32];
int p = 0;

void printMatching(int index)
{
    int j;

    printf("{ ");

    for(j = 0; j < E; j++)
    {
        if(combinations[index][j] != -1)
        {
            printf("%d ", combinations[index][j]);
        }
    }

    printf("}");
}

void findMatching()
{
    int i, j, k;
    int x, start, end;
    int flag;
    int freq[V];

    for(i = 0; i < 32; i++)
    {
        for(k = 0; k < V; k++)
        {
            freq[k] = 0;
        }

        j = 0;

        while(j < E && combinations[i][j] != -1)
        {
            x = combinations[i][j];

            start = edges[x][0];
            end = edges[x][1];

            freq[start]++;
            freq[end]++;

            j++;
        }

        flag = 0;

        for(k = 0; k < V; k++)
        {
            if(freq[k] > 1)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            arr[p] = i;
            p++;
            printMatching(i);
        }
    }
}

void findMaximalMatching()
{
    int i, j, e;
    int index;
    int edgeIndex;
    int start, end;
    int freq[V];
    int maximal;

    printf("\nMaximal Matching(s):\n");

    for(i = 0; i < p; i++)
    {
        index = arr[i];

        for(j = 0; j < V; j++)
        {
            freq[j] = 0;
        }

        for(j = 0; j < E; j++)
        {
            if(combinations[index][j] != -1)
            {
                edgeIndex = combinations[index][j];

                start = edges[edgeIndex][0];
                end = edges[edgeIndex][1];

                freq[start]++;
                freq[end]++;
            }
        }

        maximal = 1;

        for(e = 0; e < E; e++)
        {
            /* jo koi ek pan edge evi male jeni freq !=0 hoi eno matlab apde ae edge no add kari saki */
            if(freq[edges[e][0]] == 0 &&
               freq[edges[e][1]] == 0)
            {
                maximal = 0;
                break;
            }
        }

        if(maximal == 1)
        {
            printMatching(index);
            printf("\n");
        }
    }
}

void findMaximumMatching()
{
    int i, j;
    int index;
    int size;
    int maxSize;

    maxSize = 0;

    for(i = 0; i < p; i++)
    {
        index = arr[i];
        size = 0;

        for(j = 0; j < E; j++)
        {
            if(combinations[index][j] != -1)
            {
                size++;
            }
        }

        if(size > maxSize)
        {
            maxSize = size;
        }
    }

    printf("\nMaximum Matching(s):\n");

    /* Print all maximum matchings */
    for(i = 0; i < p; i++)
    {
        index = arr[i];
        size = 0;

        for(j = 0; j < E; j++)
        {
            if(combinations[index][j] != -1)
            {
                size++;
            }
        }

        if(size == maxSize)
        {
            printMatching(index);
            printf("\n");
        }
    }

    printf("Matching Number = %d\n", maxSize);
}

void main()
{
    findMatching();

    findMaximalMatching();

    findMaximumMatching();
}
