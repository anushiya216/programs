#include<stdio.h>
void swap();
int main()
{
    int a,b;
    scanf("%d %d",&a ,&b);
    swap(&a, &b);
    printf("%d %d",a,b);
}
void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}