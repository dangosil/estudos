//EXERCÍCIO 2
//Crie um programa que leia um vetor A com 5 elementos
//inteiros. Além disso, crie um outro vetor B de mesmo tipo e
//tamanho. Este vetor B deve receber os valores do vetor A
//multiplicado por 10. Por fim, imprima os valores do vetor B em
//linhas diferentes. Cada linha deve dizer primeiro qual a
//posição do elemento e posteriormente o valor dentro dele.

#include<stdio.h>
#include<stdlib.h>

int main() {
    int A[5];
    int B[5];
    int i;
    
    for(i = 0; i < 5; i++) {
        printf("Digite um numero: ");
        scanf("%d", &A[i]);
        printf("%d\n", A[i]);
        B[i] = A[i]*10;
    }
    for(i = 0; i < 5; i++) {
        printf("Posicao: %d Valor:%d\n", i, B[i]);
    }



    system("PAUSE");
    return 0;
}
