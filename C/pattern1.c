#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n;
    scanf("%d", &n);
  	// Complete the code to print the pattern.
    int size = 2 * n - 1;

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            // Find the minimum distance to any of the 4 borders
            int min = i < j ? i : j;
            if (min > size - 1 - i)
                min = size - 1 - i;
            if (min > size - 1 - j)
                min = size - 1 - j;

            printf("%d ", n - min);
        }
        printf("\n");
    }
    return 0;
}
