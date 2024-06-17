#include<stdio.h>
#include<stdlib.h>
int main() {
    int peso, pessoas, i = 1;
    
    do {
        printf("Quantas pessoas: ");
        scanf("%d", &pessoas);
        if(pessoas < 1) {
        printf("Deve ser pelo menos 1.\n");
        }
    }while(pessoas < 1);
    
    do {
        printf("Digite um peso: ");
        scanf("%d", &peso);
        printf("Seu peso eh: %d \n", peso);
        i++;
    }while(i <= pessoas);

    system("PAUSE");
    return 0;
}
