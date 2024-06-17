#include<stdio.h>
#include<stdlib.h>

int main() {
    float n1, n2;
    printf("Digite um numero: ");
    scanf("%f", &n1);
    printf("Digite outro numero: ");
    scanf("%f", &n2);
    
    printf("maior numero eh: %f\n", n1>n2? n1:n2);
    
    system("PAUSE");
    return 0;
}
