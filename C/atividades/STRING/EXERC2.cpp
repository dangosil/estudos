#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main() {
    char nome[20];
    char sobrenome[40];
    printf("Digite nome e sobrenome: ");
    scanf("%s %s", &nome, &sobrenome);
    strcat(nome, " ");
    strcat(nome, sobrenome);
    printf("seu nome eh: %s\n", nome);
    



    system("PAUSE");
    return 0;
}
