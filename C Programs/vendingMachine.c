#include<stdio.h>
int main()
{
    int opt,n;
    float money;
    printf("Drinks Menu\n  1.Coke\n  2.Pepsi\n  3.Water\n ");
    printf("How many drinks you want: ");
    scanf("%d",&n);
    float m=n*1.25;
    while(n!=0)
    {
        n--;
        scanf("%d",&opt);
        switch(opt)
        {
        case 1:
            continue;
            break;
        case 2:
            continue;
            break;
        case 3:
            continue;
            break;
        default:
            printf("Wrong Choice");
            n++;
        }
    } 
    printf("enter the amount you have: ");
    scanf("%f",&money);
    if(m<=money)
    {
        printf("Successfully Dispensed");
    }
    else 
    {
        printf("You don't Have enough money");
    }
}