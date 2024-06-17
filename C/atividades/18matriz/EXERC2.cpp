#include<stdio.h>
#include<stdlib.h>

int main() {
    int matriz[3][3];
    int i, j;
    int mult = 1;
    
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
                printf("Digite o valor [%d][%d]: ", i, j);
                scanf("%d", &matriz[i][j]);
        }
    }
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
                if(j == 1) {
                    mult = mult * matriz[i][j];
                }
        }
    }
    printf("A multiplicacao sera: %d\n", mult);

    system("PAUSE");
    return 0;
}
