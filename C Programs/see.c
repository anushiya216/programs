#include<stdio.h>
int main()
{
    int n,i,j;
    scanf("%d",&n);
    int arr[n][2];
    for(i=0;i<n;i++)
    {
        for(j=0;j<2;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    printf("%d %d",arr[0][0],arr[0][1]);
    printf("\n");
    int x=arr[0][1];
    for(i=0;i<n;i++)
    {
        for(j=0;j<2;j++)
        {
            if(arr[i][0]==x+1)
            {
                printf("%d %d", arr[i][0],arr[i][1]);
                x=arr[i][1];
            }
        }
        printf("\n");
    }
}