//EXERCÍCIO 3
//Crie um programa que leia um vetor de N posições (aceitar
//somente números positivos).
//Ao final, escreva o valor do maior elemento do vetor e a
//respectiva posição que ele ocupa no vetor.

#include<stdio.h>
#include<stdlib.h>

int main() {
    int position;
    int i;
    
    printf("Quantas posicoes: ");
    scanf("%d", &position);
    
    if(position <= 0) {
        printf("Invalido\n");
        return 0;
    }
    
    int vetor[position];
    
    for(i = 0; i < position; i++) {
        do {
                printf("numero positivo posicao %d: ", i + 1);
                scanf("%d", &vetor[i]);
                if(vetor[i] < 0) {
                   printf("numero invalido\n");
                }
        }while (vetor[i] < 0);
    }
    
    int maior = vetor[0];
    int maiorP = 0;
    for(i = 1; i < position; i++) {
        if( vetor[i] > maior) {
                maior = vetor[i];
                maiorP = i;
        }
    }
    
    printf("maior valor: %d\n", maior);
    printf("posicao do maior: %d\n", maiorP + 1);

    system("PAUSE");
    return 0;
}
