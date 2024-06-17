#include<stdio.h>
#include<stdlib.h>
int main() {
    int i = 1;
    while(i <= 10) {
        printf("%d\n", i);
        
        if(i == 3) {
           continue;
        }
        i++;
    }

    system("PAUSE");
    return 0;
}
