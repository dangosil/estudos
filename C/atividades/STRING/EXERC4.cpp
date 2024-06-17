#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main() {
    char string1[50];
    char string2[50];
    printf("Digite duas palavras: ");
    gets(string1);
    gets(string2);
    int resultado = strcmp(string1, string2);
    if(resultado == 0){
        printf("iguais\n");
    } else {
        printf("diferentes\n");
    }
    


    system("PAUSE");
    return 0;
}
