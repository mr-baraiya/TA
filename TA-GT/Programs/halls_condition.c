#include <stdio.h>

// Bipartite graph
// Left vertices  = {A, B, C, D}
// Right vertices = {W, X, Y, Z}

int graph[4][4] = {
    {1, 1, 0, 0},   // A -> W, X
    {1, 0, 1, 0},   // B -> W, Y
    {0, 1, 0, 1},   // C -> X, Z
    {0, 0, 1, 1}    // D -> Y, Z
};

// All subsets of {A, B, C, D}
int subsets[15][4] = {
    {1, 0, 0, 0},   // A
    {0, 1, 0, 0},   // B
    {0, 0, 1, 0},   // C
    {0, 0, 0, 1},   // D

    {1, 1, 0, 0},   // A B
    {1, 0, 1, 0},   // A C
    {1, 0, 0, 1},   // A D
    {0, 1, 1, 0},   // B C
    {0, 1, 0, 1},   // B D
    {0, 0, 1, 1},   // C D

    {1, 1, 1, 0},   // A B C
    {1, 1, 0, 1},   // A B D
    {1, 0, 1, 1},   // A C D
    {0, 1, 1, 1},   // B C D

    {1, 1, 1, 1}    // A B C D
};

int checkHallCondition()
{
    int s, i, j;
    int leftCount, rightCount;
    int usedRight[4];

    for (s = 0; s < 15; s++)
    {
        leftCount = 0;
        rightCount = 0;

        for (j = 0; j < 4; j++)
            usedRight[j] = 0;

        // Count vertices in subset
        for (i = 0; i < 4; i++)
        {
            if (subsets[s][i] == 1)
            {
                leftCount++;

                // Find neighbours
                for (j = 0; j < 4; j++)
                {
                    if (graph[i][j] == 1)
                        usedRight[j] = 1;
                }
            }
        }

        // Count neighbours
        for (j = 0; j < 4; j++)
        {
            if (usedRight[j] == 1)
                rightCount++;
        }

        // Hall's condition
        if (rightCount < leftCount)
            return 0;
    }

    return 1;
}

void main()
{
    int result;

    result = checkHallCondition();

    if (result == 1)
        printf("Hall's condition is satisfied.");
    else
        printf("Hall's condition is not satisfied.");
}