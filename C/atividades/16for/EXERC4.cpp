#include<stdio.h>
#include<stdlib.h>

int main() {
    float valorProduto, produtosComprados;
    int i;
    float soma = 0;
    float somaT = 0;
    
    for(i = 1; i <= 5; i++) {
        printf("Quantidade do produto %d: ", i);
        scanf("%f", &produtosComprados);
        printf("Valor do produto %d: ", i);
        scanf("%f", &valorProduto);
        soma += produtosComprados;
        somaT += produtosComprados * valorProduto;
            
    }
    printf("Quantidade de produtos: %.2f\nValor total: %.2f", soma, somaT);

    system("PAUSE");
    return 0;
}
