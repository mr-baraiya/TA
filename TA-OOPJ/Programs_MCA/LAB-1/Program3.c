// Write a program to find a sum of even number 1D array. [A]

#include <stdio.h>

int main() {
    int n, sum = 0;
    printf("Enter number of elements in array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        if (arr[i] % 2 == 0) {
            sum += arr[i];
        }
    }

    printf("Sum of even numbers in array = %d\n", sum);
    return 0;
}
