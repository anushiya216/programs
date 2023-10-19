#include<stdio.h>
#include<stdlib.h>
struct student
{
    int regNo;
    char name[25];
    int mark[3];
}a[5];               //structure reference
int main()
{
  for(int i=0;i<5;i++)
  {
    scanf("%d",&a[i].regNo);
    scanf("%s",&a[i].name);
    for(int j=0;j<3;j++)
    {
        scanf("%d",&a[i].mark[j]);
    }
  }
  for(int i=0;i<5;i++)
  {
    printf("\n%d %s -",a[i].regNo,a[i].name);
    for(int j=0;j<3;j++)
    {
        printf("%d ",a[i].mark[j]);
    }
  }
    return 0;
}