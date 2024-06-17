#include<stdio.h>
#include<stdlib.h>
int main() {
    int numeroFuncionarios, ID, salario, i;
    i = 0;
    char sexo, ferias;
    printf("Quantos funcionarios serao cadastrados? ");
    scanf("%d", &numeroFuncionarios);
    while(i < numeroFuncionarios) {
        printf("Seu ID: ");
        scanf("%d", &ID);
        
        printf("Seu salario: ");
        scanf("%d", &salario);
        
        printf("Seu sexo (M/F): ");
        scanf(" %c", &sexo);
        
        printf("Voce tera ferias? (S/N)");
        scanf(" %c", &ferias);
        
        printf("ID: %d\nSalario: %d\nSexo: %c\nFerias: %c\n", ID, salario, sexo, ferias);
        i++;
    }
    
    
    system("PAUSE");
    return 0;
}
