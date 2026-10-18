// Print the following Patterns: [B]

#include <stdio.h>
#include <string.h>

int main() {
    printf("--- Pattern 1 ---\n");
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            printf("%d", j);
        }
        printf("\n");
    }

    printf("\n--- Pattern 2 ---\n");
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            printf("%d", i);
        }
        printf("\n");
    }

    printf("\n--- Pattern 3 ---\n");
    char str[] = "darshan";
    int len = strlen(str);
    for (int i = 1; i <= len; i++) {
        for (int j = 0; j < i; j++) {
            printf("%c", str[j]);
        }
        printf("\n");
    }

    printf("\n--- Pattern 4 ---\n");
    char *symbols[] = {"*****", "####", "***", "##", "*"};
    for (int i = 0; i < 5; i++) {
        printf("%s\n", symbols[i]);
    }

    return 0;
}
