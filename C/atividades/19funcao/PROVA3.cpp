#include<stdio.h>
#include<stdlib.h>

int contador(int n1) {
    return n1 - 1;
}

int main() {
    int i;
    for(i = 11; i > 0; i--) {
        printf("%d\n", contador(i));
    }



    system("PAUSE");
    return 0;
}
