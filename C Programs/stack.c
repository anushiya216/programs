#include<stdio.h>
#include<stdlib.h>
int top=-1,s[6];

void push()
{
    int ele,n;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&ele);
        if(top==6)
        {
            printf("OverFlow");
        }
        else{
            top++;
            s[top]=ele;
        }
    } 
}
void pop()
{
    if(top==-1)
    {
        printf("Underflow");
    }
    else 
    {
        top--;
    }
}
void peek()
{
    printf("%d",s[top]);
}
void display()
{
    if(top==-1)
    {
        printf("Stack is Empty");
    }
    else 
    {
        for(int i=top;i>=0;i--)
        {
            printf("%d",s[top]);
            top--;
        }
    }
}
int main()
{
    int choice;
  while(1)
  {
    printf("\n 1.push");
    printf("\n 2.pop");
    printf("\n 3.peek");
    printf("\n 4.display");
    printf("\nEnter the choice: ");
    
    scanf("%d",&choice);
    switch (choice)
    {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break;
        case 4:
            display();
            break;
        default:
            printf("wrong input");
    }
  }
}
