#include<stdio.h>
#include<stdlib.h>

int main() {
    int numero  = 0, i;
    
    do{
        numero++;
        for(i = 1; i <= 10; i++) {
                printf("%d x %d = %d\n", i, numero, numero*i);
        }
        printf("\n");
    }while(numero < 10);
    

    system("PAUSE");
    return 0;
}
