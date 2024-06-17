#include<stdio.h>
#include<stdlib.h>

int main() {
    int i, idade;
    
    for(i = 1; i <= 10; i++) {
        printf("Digite a idade %d: ", i);
        scanf("%d", &idade);
        
        if(idade >= 8 && idade <= 10){
                printf("Categoria: Mirim.\n");
        }
        else if(idade >= 11 && idade <=17) {
                printf("Categoria: Junior.\n");        
        }
        else if(idade > 17){
                printf("Categoria: Adulto.\n");
                
        }
        else {
                printf("Idade invalida.\n");
                i--;
        }
    }

    system("PAUSE");
    return 0;
}
