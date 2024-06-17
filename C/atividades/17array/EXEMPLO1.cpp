//Crie um programa que leia e guarde a idade de 5 pessoas.
//Depois de perguntar todas as idades, imprima cada uma delas.
#include<stdio.h>
#include<stdlib.h>

int main() {
    int i, idades[5];
    
    for(i = 0; i < 5; i++) {
        printf("Digite sua idade: ");
        scanf("%d", &idades[i]);
    }
    printf("As idades digitadas sao: \n");
    for(i = 0; i < 5; i++) {
        printf("Idade %d: %d\n", i+1, idades[i]);
    }



    system("PAUSE");
    return 0;
}
