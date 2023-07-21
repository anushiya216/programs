#include<stdio.h>
int main()
{
    int m,n,i,count=0;
    scanf("%d",&m);
    char arr[m];
    for(i=0;i<m;i++)
    {
        scanf("%s",&arr[i]);
    }
    scanf("%d",&n);
    char arr2[n];
    for(i=0;i<n;i++)
    {
        scanf("%s",&arr2[i]);
    }
    if(m!=n)
    {
        printf("False");
    }
    else if(m==1 && n==1)
    {
        printf("True");
    }
    else 
    {
        for(i=0;i<m;i++)
        {
            if(arr[i]!=arr2[i])
            {
                count++;
            }
            else 
            {
                count=count;
            }
        }
        if(count!=2)
        {
            printf("False");
        }
        else if(count==2)
        {
            printf("True");
        }
    }
}
    