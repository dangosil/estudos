// 7 Crie um programa que leia um n�mero digitado pelo usu�rio, 
//sendo 1 
//manh�, 2 
//tarde e 3 
//noite. 
//Crie uma fun��o que considere este n�mero como um char 
//para representar o turno 
//e imprimir na tela.

#include<stdio.h>
#include<stdlib.h>
char turno(int periodo) {
    if(periodo == 1) {
        return 'M';
    } else if(periodo == 2) {
        return 'T';
    } else if(periodo == 3) {
        return 'N';
    } else {
        printf("Invalido");
    }
}

int main() {
    int num;
    printf("1 - manh� 2 - tarde 3 - noite: ");
    scanf("%d", &num);
    printf("%c\n", turno(num));

    system("PAUSE");
    return 0;
}
