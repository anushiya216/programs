#include<stdio.h>
#include<stdlib.h>
struct student
{
    int regNo;
    char name[25];
    int mark[3];
    char grade;
}a[5];               //structure reference
int main()
{
  for(int i=0;i<5;i++)
  {
    scanf("%d",&a[i].regNo);
    scanf("%s",&a[i].name);
    scanf("%d",&a[i].mark);
    scanf("%s",&a[i].grade);
  }
  for(int i=0;i<5;i++)
  {
    printf("\n%d %s - %d %c ",a[i].regNo,a[i].name,a[i].mark,a[i].grade);
  }
    return 0;
}