#include<stdio.h>
void right(int arr[],int n);
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
        right(arr,n);
    }
    for(int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
}
void right(int arr[],int n)
{
    int temp=arr[n-1];
    for(int i=n-1;i>0;i--)
    {
        arr[i]=arr[i-1];
    }
    arr[0]=temp;
}