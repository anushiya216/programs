#include<stdio.h>
int sum();
int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    int res;
    res=sum(arr,n);
    printf("%d",res);
}
int sum(int arr[],int n)
{
    int c=0;
    for(int i=0;i<n;i++)
    {
        c=c+arr[i];
    }
    return c;
}