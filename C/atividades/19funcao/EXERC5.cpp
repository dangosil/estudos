// 5 Crie um programa que leia um n�mero inteiro e possua uma 
//fun��o que calcula o dobro deste n�mero. Imprima o valor da 
//fun��o na tela.

#include<stdio.h>
#include<stdlib.h>

int dobro(int num) {
    return 2 * num;
}

int main() {
    int n1;
    
    printf("numero: ");
    scanf("%d", &n1);
    
    int result = dobro(n1);
    printf("%d\n", result);
    
    system("PAUSE");
    return 0;
}
