#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,i,j,max=0,sum=0;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    int k;
    scanf("%d",&k);
    for(i=0;i<n-(k-1);i++)
    {
        for(j=i;j<=i+(k-1);j++)
        {
            if(arr[j]>max)
            {
                max=arr[j];
            }
        }
        printf("%d ",max);
    }
    return 0;
}
// output:
// 8
// 1 3 -1 -3 5 3 6 7
// 3
// 3 3 5 5 6 7 
// output:
// 6
// 1 2 3 4 5 6
// 2
// 2 3 4 5 6 