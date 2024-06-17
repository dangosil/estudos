#include<stdio.h>
#include<stdlib.h>
int main() {
    int numero, i = 0;
    float divisao;
    
    printf("Digite um numero: ");
    scanf("%d", &numero);
    divisao = numero;
    do{
        divisao = divisao / 2;
        printf("%.2f\n", divisao);
        if(divisao < 1){
            printf("%d\n", i);
            break;
        }
        i++;
    }while(numero >=1);

    system("PAUSE");
    return 0;
}
