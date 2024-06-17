#include <stdio.h>
#include <stdlib.h>

int main() {
    float nota1, nota2;
r
    do {
        printf("Digite a primeira nota (0 a 100): ");
        scanf("%f", &nota1);
        if (nota1 < 0 || nota1 > 100) {
            printf("Nota invalida. Tente novamente.\n");
        }
    } while (nota1 < 0 || nota1 > 100);

    do {
        printf("Digite a segunda nota (0 a 100): ");
        scanf("%f", &nota2);
        if (nota2 < 0 || nota2 > 100) {
            printf("Nota invalida. Tente novamente.\n");
        }
    } while (nota2 < 0 || nota2 > 100);

    float media = (nota1 + nota2) / 2;

    printf("A media das notas %.2f e %.2f eh: %.2f\n", nota1, nota2, media);

    system("PAUSE");
    return 0;
}

