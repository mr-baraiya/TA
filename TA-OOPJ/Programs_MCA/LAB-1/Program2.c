// Write a program to find a sum of numbers entered by user. (E.g: 582=5+8+2=15) [A]

#include <stdio.h>

int main() {
    int num, sum = 0, rem;
    printf("Enter a number: ");
    scanf("%d", &num);

    int temp = num;
    while (temp != 0) {
        rem = temp % 10;
        sum += rem;
        temp /= 10;
    }

    printf("Sum of digits of %d = %d\n", num, sum);
    return 0;
}
