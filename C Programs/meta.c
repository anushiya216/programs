#include<stdio.h>
int main()
{
    int i,n,flag=0,cfi,cte,ctw;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    if(arr[0]!=5)
    {
        printf("false");
    }
    else 
    {
        for(i=0;i<n;i++)
        {
            if(arr[i]==5)
            {
                cfi++;
            }
            else if(arr[i]==10)
            {
                cte++;
            }
        }
        for(i=1;i<=n;i++)
        {
            if(arr[i]==10 && (arr[i-1]==5) || (arr[i]==10 && arr[i-2]==5))
            {
                flag=4;
            }
            else if((arr[i]==20) && (arr[i-1] == 10 && arr[i-2]==5) || ((arr[i]==20)  && (arr[i-1]==5|| arr[i-2]==10)))
            {
                flag=3;
            }
            else if(arr[i]==5)
            {
                flag=1;
            }
            else 
            {
                flag=0;
            }
        }
    }
    if(flag==1 || flag==3 || flag==4)
    {
        printf("%d",flag);
        printf("true");
    }
    else 
    {
        printf("false");
    }
}