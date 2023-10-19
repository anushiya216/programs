#include<stdio.h>
int add(int*a,int*b);
int main()
{
    int n,m;
    
    scanf("%d %d",&n,&m);
    int *a=&n,*b=&m;
    printf(add(a*,b*));

}
int add(int a*,int b*)
{
    int n1=a*,n2=b*;
    int c=n1+n2;
    return c;
}