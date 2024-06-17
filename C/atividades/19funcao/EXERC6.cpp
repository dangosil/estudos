// 6 Crie um programa que leia o salário de uma pessoa. Crie uma 
//função que dá um aumento de 10% em cima do salário 
//digitado. Ao final imprima o novo salário.

#include<stdio.h>
#include<stdlib.h>

float aumento(float sl) {
    return sl * 1.1;
}

int main() {
    float salario;
    
    printf("Salario: ");
    scanf("%f", &salario);
    
    //float novoS = aumento(salario);
    printf("%.2f\n", aumento(salario));


    system("PAUSE");
    return 0;
}
