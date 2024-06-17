// 4 Crie um programa que leia um texto e passe um texto para 
//uma função imprimir o texto na tela. 

#include<stdio.h>
#include<stdlib.h>

void ler(char texto[]) {
    printf("%s\n", texto);
}

int main() {
    char texto[100];
    printf("Texto: ");
    scanf(" %[^\n]", texto);
    printf("%s\n", texto);
    
    ler(texto);
    
    system("PAUSE");
    return 0;
}
