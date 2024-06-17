#include<stdio.h>
#include<stdlib.h>

int main() {
    int matriz[3][3];
    int matriz2[3][3];
    int matriz3[3][3];
    int i, j;
    
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
                printf("Digite o valor [%d][%d]: ", i, j);
                scanf("%d", &matriz[i][j]);
        }
    }
 //   for(i = 0; i < 3; i++) {
//        for(j = 0; j < 3; j++) {
//                printf("%d ", matriz[i][j]);
//                
//        }
//        printf("\n");
//    }
    
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
                printf("Digite o valor [%d][%d]: ", i, j);
                scanf("%d", &matriz2[i][j]);
                matriz3[i][j] = matriz[i][j] + matriz2[i][j];
        }
    }
    //for(i = 0; i < 3; i++) {
//        for(j = 0; j < 3; j++) {
//                printf("%d ", matriz2[i][j]);
//                
//        }
//        printf("\n");
//    }
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
                printf("%d ", matriz3[i][j]);
                
        }
        printf("\n");
    }

    system("PAUSE");
    return 0;   
}
