#include<stdio.h>
int main()
{
    int n,balance=1000,a,b=1,c;
    while(b!=0)
    {
        printf("\n\n        ATM       ");
        printf("\n1.Check Balance\n2.Deposit money\n3.Withdraw Money\n4.Exit\nEnter Your Choice: ");
        scanf("%d",&n);
        switch(n)
        {
            case 1:
                printf("    Your Account Balance is %d" , balance);
                break;
            case 2:
                printf("Your Amount you want to deposit: " );
                scanf("%d",&a);
                balance+=a;
                printf("Your Money deposit is Successful");
                printf("\n    Your Account Balance is %d" , balance);
                break;
            case 3:
                printf("Your Amount you want to withdraw: " );
                scanf("%d",&a);
                if(balance>a)
                {
                    balance-=a;
                    printf("Your Money Withdraw is Successful");
                     printf("\n    Your Account Balance is %d" , balance);
                }
                else if(a<0)
                {
                    printf("Wrong Input");
                }
                else
                {
                    printf("You don't have enough money");
                }
                break;
            case 4:
                b=0;
                break;
            default:
                printf("Wrong Choice");
        }
    }
}