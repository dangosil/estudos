#include<stdio.h>
#include<stdlib.h>
int main() {
    int numero, i;
    i = 0;
    printf("Digite um numero: ");
    scanf("%d", &numero);
    
    if(numero > 0) {
        while(i <= numero) {
             printf("%d\n", numero);
             numero--;         
        }   
    }else if(numero < 0) {
        while(i >= numero) {
             printf("%d\n", numero);
             numero++;
        }
    }else {
        printf("%d\n", numero);
    }

    system("PAUSE");
    return 0;
}
