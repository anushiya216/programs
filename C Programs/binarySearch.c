#include<stdio.h>
#include<stdlib.h>
int search(int mid,int key,int arr[],int n);
int main()
{
    int n,key;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    n=n-1;
    scanf("%d",&key);
    int mid=(0+n)/2;
    printf("%d",(search(mid,key,arr,n)));
}
int search(int mid,int key,int arr[],int n)
{
    int f=0,l=n;
    if(arr[mid]==key)
    {
        return mid;
    }
    else
    {
        if(arr[mid]>key)
        {
            mid=(0+(mid-1))/2;
            return search(mid,key,arr,n);
        }
        else 
        {
            mid=((mid+1)+n)/2;
            return search(mid,key,arr,n);
        }
    }
}