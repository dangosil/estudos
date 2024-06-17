#include<stdio.h>
#include<stdlib.h>
int main() {
    int numeros, i = 0;
    float media;
    float soma = 0;
    
    do {
        printf("Digite um numero: ");
        scanf("%d", &numeros);
        if(numeros == 9999) {
        break;  
        }
        soma += numeros;
        i++;
     }while(i > 0);
     
     media = soma/i;
     printf("%.2f\n", media);

    system("PAUSE");
    return 0;
}
