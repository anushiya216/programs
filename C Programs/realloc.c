#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,*ptr;
    scanf("%d",&n);
    ptr=realloc(ptr,n*sizeof(int));
    for(int i=0;i<n;i++)
    {
        ptr[i]=i+1;
    }
    for(int i=0;i<n;i++)
    {
        printf("%d ",ptr[i]);
        free(ptr);
    }
}