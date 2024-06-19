#include <stdio.h>
#include <stdlib.h>
char poltronas[10][10];

void reservar();
void visualizar();
void sair();

void exec() {
    int opt;
    printf("\nO que deseja fazer? 1 - Reservar | 2 - Visualizar | 3 - Sair\n");
    scanf("%d", &opt);
    
    switch(opt) {
        case 1:
           reservar();
           break;
        case 2:
           visualizar();
           break;
        case 3:
           sair();
           break;
        default:
           printf("Opção inválida!\n");
           exec();
           break;
    }
}
void reservar() {
   int fileira;
   int poltrona;
   
   printf("Digite sua fileira: ");
   scanf("%d", &fileira);
   
   printf("Digite sua poltrona: ");
   scanf("%d", &poltrona);
   
   for(int i = 1; i <= 10; i++) {
      for(int j = 1; j <= 10; j++) {
          if(i == fileira && j == poltrona) {  
             if(poltronas[i][j] == 'X') {
                printf("Ocupado\n");
                exec();
             }
             
             poltronas[i][j] = 'X';
          }
      }
   }
   
   exec();
}

void visualizar() {
    for(int i = 1; i <= 10; i++) {
        for(int j = 1; j <= 10; j++) {
             printf("%c ", poltronas[i][j]);
        }
        
        printf("\n");
    }
    
    exec();
}

void sair() {
    printf("Programa Saindo!\n");

}


int main() {
     for(int i = 1; i <= 10; i++) {
        for(int j = 1; j <= 10; j++) {
          poltronas[i][j] = '0';
        }
    }
    exec();
    
    system("PAUSE");
    return 0;
}
