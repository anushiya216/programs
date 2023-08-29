#include<stdio.h>
void left(int arr[],int n);
int main()
{
    int n;
    scanf("%d",&n);
    int arr[n],k;
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    scanf("%d",&k);
    for(int i=0;i<k;i++)
    {
        left(arr,n);
    }
    for(int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
}
void left(int arr[],int n)
{
    int temp=arr[0];
    for(int i=0;i<n;i++)
    {
        arr[i]=arr[i+1];
    }
    arr[n-1]=temp;
}