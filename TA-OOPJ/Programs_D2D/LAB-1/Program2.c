// WAP to find a sum of numbers entered by user. (E.g: 582=5+8+2=15) [A]

#include <stdio.h>
#include <stdlib.h>

int main() {
    int num, temp, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &num);

    temp = abs(num);
    while (temp > 0) {
        sum += temp % 10;
        temp /= 10;
    }

    printf("Sum of digits of %d is: %d\n", num, sum);
    return 0;
}
