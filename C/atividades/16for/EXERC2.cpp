#include<stdio.h>
#include<stdlib.h>

int main() {
    int numero, i;
    
    printf("Digite um numero: ");
    scanf("%d", &numero);
    
    for(i = 0; i <= 10; i++) {
        printf("%d x %d = %d\n", i, numero, numero*i);
    }


    system("PAUSE");
    return 0;
}
