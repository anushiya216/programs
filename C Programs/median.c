#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,i;
    float ans;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    if(n%2!=0)
    {
        printf("%d",arr[n/2]);
    }
    else
    {
        ans=(arr[n/2]+arr[(n/2)-1]);
        printf("%.1f",(ans)/2);
        
    }
}