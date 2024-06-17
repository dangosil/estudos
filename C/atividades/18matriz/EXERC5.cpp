#include <stdio.h>
#include <stdlib.h>

int main() {
    int ordem, i, j;
    
    printf("Digite a ordem da matriz: ");
    scanf("%d", &ordem);

    int matriz[ordem][ordem];

    for (i = 0; i < ordem; i++) {
        for (j = 0; j < ordem; j++) {
            printf("Digite o valor [%d][%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    printf("Elementos da diagonal secundaria:\n");
    for (i = 0; i < ordem; i++) {
        printf("%d ", matriz[i][ordem - 1 - i]);
    }
    printf("\n");

    system("PAUSE");
    return 0;
}

