#include<stdio.h>
int main()
{
    int m,n,o,i,j;
    
    scanf("%d",&m);
    scanf("%d",&n);
    char arr[m][n];
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%c",&arr[i][j]);
        }
    }
    scanf("%d",&o);
    char arr2[o];
    for(i=0;i<o;i++)
    {
        scanf("%c",&arr2[i]);
    }
    
}