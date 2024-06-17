#include<stdio.h>
#include<stdlib.h>

int main() {
    int matriz[3][3];
    int i, j;
    
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
                printf("Digite os numeros [%d][%d]: ", i, j);
                scanf("%d", &matriz[i][j]);
        }
    }
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
                if(i != j){
                printf("%d ", matriz[i][j]);
               } 
        }
        printf("\n");
    }

    system("PAUSE");
    return 0;
}
