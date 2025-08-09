#include <stdio.h>

int isPrime(int n){
    if (n <= 1) return 0;
    for (int i = 2; i < n/2; i++){
        if (n%i == 0){
            return 0;
        }
    }
    return 1;
}


int main(){
    int number = 29;
    int check = isPrime(number);
    if (check == 1) printf("%d is a prime number",number);
    else printf("%d is not a prime number",number);
    
    return 0;
}
