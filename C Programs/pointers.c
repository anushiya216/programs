#include<stdio.h>
#include<stdlib.h>
void swap(int *a,int *b);
int main()
{
    int a,b;
    scanf("%d %d",&a ,&b);
    swap(&a,&b);
    printf("%d %d",a,b);
}
void swap(int *a,int *b)
{
    *a=*a^*b;
    *b=*b^*a;
    *a=*a^*b;
}