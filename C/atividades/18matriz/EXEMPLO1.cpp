#include<stdio.h>
#include<stdlib.h>

int main() {
    int i, j;
    int matriz[3][3];
    
    for(i = 0; i < 3; i++) {
        for(j= 0; j < 3; j++) {
                printf("Digite o valor [%d][%d]: ", i, j);
                scanf("%d", &matriz[i][j]);
        }
    }
    for(i = 0; i < 3; i++) {
        for(j= 0; j < 3; j++) {
                if(
                printf("%d ", matriz[i][j]);
        }
        printf("\n");
    }

    system("PAUSE");
    return 0;
}
