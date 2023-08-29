#include <stdio.h>
int sum();
int main()
{
    int a,b,ans;
    scanf("%d",&a);
    scanf("%d",&b);
    ans=sum(a,b);
    printf("%d",ans);
}
int sum(int n, int m)
{
    int c=0;
    for(int i=n;i<=m;i++)
    {
        c=c+i;
    }
    return c;
}