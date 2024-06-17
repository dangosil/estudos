// 5 Crie um programa que leia um número inteiro e possua uma 
//função que calcula o dobro deste número. Imprima o valor da 
//função na tela.

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
