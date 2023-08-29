#include<stdio.h>
#include<stdlib.h>
struct student
{
    int regNo;
    char name[25];
    int mark[5];
}a;
int main()
{
    scanf("%d",&a.regNo);
    scanf("%s",a.name);
    for(int i=0;i<5;i++)
    {
        scanf("%d ",&a.mark[i]);
    }
    printf("%s-",a.name);
    printf("%d :\n",a.regNo);
    for(int i=0;i<5;i++)
    {
        printf("%d ",a.mark[i]);
    }
    return 0;
}

