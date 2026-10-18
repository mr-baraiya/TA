// Write a program to find a total odd and total even digit of a given number.[B]

#include <stdio.h>

int main() {
    int num, evenCount = 0, oddCount = 0, rem;
    printf("Enter a number: ");
    scanf("%d", &num);

    int temp = num < 0 ? -num : num;
    if (temp == 0) {
        evenCount = 1;
    } else {
        while (temp != 0) {
            rem = temp % 10;
            if (rem % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            temp /= 10;
        }
    }

    printf("Total even digits: %d\n", evenCount);
    printf("Total odd digits: %d\n", oddCount);
    return 0;
}
