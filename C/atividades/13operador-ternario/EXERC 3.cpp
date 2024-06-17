#include<stdio.h>
#include<stdlib.h>

int main() {
    float n1, n2, n3;
    printf("Digite 3 numeros: ");
    scanf("%f\n%f\n%f", &n1, &n2, &n3);
    printf("Maior numero eh %.2f\n", n1>n2 && n1>n3? n1 : n2>n1 && n2>n3? n2:n3);
    
    system("PAUSE");
    return 0;
}
