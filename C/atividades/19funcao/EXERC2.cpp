#include<stdio.h>
#include<stdlib.h>

void mensagem() {
    printf("-------------------------\n");
}

int repetir(int i, int separador){
    while(i < separador) {
        mensagem();
        i++;
    }
} 

int main() {
    int i = 0, separador;
    
    printf("Quantos separadores? ");
    scanf("%d", &separador);
    
    repetir(i, separador);
    printf("Ola mundo!\n");
    repetir(i, separador);

    system("PAUSE");
    return 0;
}
