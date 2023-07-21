#include<stdio.h>
#include<stdlib.h>
#define N 5
int top=-1;
int arr[N];
void push()
{
    int val,m,i;
    printf("enter the size:");
    scanf("%d",&m);
    if(top==N-1)
    {
        printf("stack overflow");
    }
    for(i=0;i<m;i++)
    {
        scanf("%d",&val);
        top++;
        arr[top]=val;
    }
    
}
void pop()
{
    if(top==-1)
    {
        printf("Stack is underflow");
    }
    else
    {
        printf("%d is deleted",arr[top]);
        top--;
    }
}
void peek()
{
    if(top==-1)
    {
        printf("Stack is underflow");
    }
    else
    {
        printf("%d ",arr[top]);
    }
}
void display()
{
    if(top==-1)
    {
        printf("Stack is empty");
    }
    else
    {
        for(int i=top;i>=0;i--)
        {
            printf("%d ",arr[i]);
        }
        
    }
}
int main()
{
    int choice,i;
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
            push(arr,top);
            break;
        case 2:
            pop(arr,top);
            break;
        case 3:
            peek(arr,top);
            break;
        case 4:
            display(arr,top);
            break;
        default:
            printf("wrong input");
    }
  }
    
}
