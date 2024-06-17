#include<stdio.h>
#include<stdlib.h>
int main() {
    int numero;
    int i = 10;
    printf("Digite um numero maior que 10: ");
    scanf("%d", &numero);
    
    if(numero < 10){
        printf("Menor que 10.");
    }else{
        while(i <= numero) {
        printf("%d\n", i);
        i++;
        }   
    }
    
    system("PAUSE");
    return 0;
}
