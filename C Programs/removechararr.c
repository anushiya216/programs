#include<stdio.h>
#include<string.h>
void main()
{
    int n,i,m;
    n=50;
    char arr[n];
    gets(arr);
    m=strlen(arr);
    puts(arr);
    for(i=0;i<m;i++)
    {
        if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z'))
        {
            printf("%c",arr[i]);
        }
    }
}
// output
// hello world7 welcome87 to- C 99programming.
// helloworldwelcometoCprogramming