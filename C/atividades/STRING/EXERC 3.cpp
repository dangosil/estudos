#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main() {
    char texto[50];
    printf("Digite um texto:\n");
    gets(texto);
    int tamanho = strlen(texto);
    printf("Tamanho da string eh: %d\n", tamanho);
    



    system("PAUSE");
    return 0;
}
