#include<stdio.h>
#include<stdlib.h>
int main() {
    float valor1, valor2;
    
    printf("Primeiro valor: ");
    scanf("%f", &valor1);
    printf("Segundo valor: ");
    scanf("%f", &valor2);
    
    while(valor2 == 0) {
        printf("O valor precisa ser diferente de 0. Digite o segundo valor novamante: ");
        scanf("%f", &valor2);   
    }
    
    float result = valor1 / valor2;
    printf("O resultado da divisao de %.f por %.f eh: %.2f\n", valor1, valor2, result);

    system("PAUSE");
    return 0;
}
