#include<stdio.h>
#include<stdlib.h>

int main(){
    int numero, i;
    int fatorial = 1;
    
    printf("Digite um numero: ");
    scanf("%d", &numero);
    
    for(i = numero; i > 0; i--) {
        fatorial = fatorial * i;
    }
    
    printf("%d! = %d\n", numero, fatorial);


    system("PAUSE");
    return 0;
}
