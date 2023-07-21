#include<stdio.h>
#include<string.h>
void main()
{
    int n,i,ans=-1;
    char k;
    n=50;
    char arr[n];
    gets(arr);
    int m=strlen(arr);
    scanf("%c",&k);
    for(i=0;i<m;i++)
    {
        if(arr[i]==k)
        {
            ans=i;
        }
    }
    if(ans==-1)
    {
        printf("sorry not found");
    }
    else 
    {
         printf("%d",ans);
    }
   
}
// output
// hello world
// o
// 7