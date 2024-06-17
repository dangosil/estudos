#include<stdio.h>
#include<stdlib.h>

int main() {
    char sexo;
    printf("Qual seu sexo? ");
    scanf("%c", &sexo);
    
    printf("Seu sexo eh %s", sexo == 'M' || sexo =='m'? "Masculino.\n":"Feminino.\n"); 

    system("PAUSE");
    return 0;
}
