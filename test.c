# include <stdio.h>

int main(){
    int num; 
    char ch;

    printf("Enter a digit: ");
    scanf("%d", &num);
    printf("Enter a char: ");
    scanf("%c", &ch);

    printf("%d", num);
    printf("%c", ch);

    return 0;
}