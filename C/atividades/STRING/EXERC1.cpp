#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main() {
    char nome[20];
    printf("Digite seu nome: ");
    scanf("%s", nome);
    char destino[20];
    strcpy(destino, nome);
    printf("O nome eh: %s\n", destino);



    system("PAUSE");
    return 0;
}
