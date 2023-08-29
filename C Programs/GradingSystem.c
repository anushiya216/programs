#include<stdio.h>
int main()
{
    int a;
    scanf("%d",&a);
    if(a>90 && a<100)
    {
        if(a==90)
        {
            printf("A-");
        }
        else if(a==100)
        {
            printf("A+");
        }
        else 
        {
            printf("A");
        }
    }
    else if(a>=90 && a<=100)
    {
        if(a==90)
        {
            printf("A-");
        }
        else if(a==100)
        {
            printf("A+");
        }
        else 
        {
            printf("A");
        }
    }
    else if(a>=80 && a<=89)
    {
        if(a==80)
        {
            printf("B-");
        }
        else if(a==89)
        {
            printf("B+");
        }
        else 
        {
            printf("B");
        }
    }
    else if(a>=70 && a<=79)
    {
        if(a==70)
        {
            printf("C-");
        }
        else if(a==79)
        {
            printf("C+");
        }
        else 
        {
            printf("C");
        }
    }
    else if(a>=60 && a<=69)
    {
        if(a==60)
        {
            printf("D-");
        }
        else if(a==69)
        {
            printf("D+");
        }
        else 
        {
            printf("D");
        }
    }
    else 
    {
        printf("F");
    }
}