//EXERCÍCIO 1
//Crie um programa que leia 10 números diferentes e os
//armazene em um vetor. Após isto, peça para o usuário digitar
//mais um número qualquer. Caso o número for igual a um dos
//10 digitadas anteriormente, imprima a mensagem Achei!, caso
//contrário Não achei!

#include<stdio.h>
#include<stdlib.h>

int main() {
    int i, numero[10];
    int n2;
    
    for(i = 0; i < 10; i++) {
        printf("Digite um numero: ");
        scanf("%d", &numero[i]);
    }
    printf("Numero 2: ");
    scanf("%d", &n2);
    
    for(i = 0; i < 10; i++) {
        if(n2==numero[i]) {
                printf("ACHEI!\n");
                break;
        }
        if(i==9) {
                printf("Nao achei!\n");
        }
    }
    

    system("PAUSE");
    return 0;
}
