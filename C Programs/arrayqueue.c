#include<stdio.h>
#include<stdlib.h>
#define N 5
int front=-1,rear=-1;
int queue[N];
void insert()
{
    int val,m,i;
    printf("enter the size:");
    scanf("%d",&m);
    if(rear==N-1)
    {
        printf("Queue overflow");
    }
        for(i=0;i<m;i++)
        {
            scanf("%d",&val);
            if(front==-1 && rear==-1)
            {
                front=rear=0;
                queue[rear]=val;
            }
            else
            {
                rear++;
                queue[rear]=val;
            }
        }
}
void delete()
{
    if(front==-1 && rear==-1)
    {
        printf("Queue is empty");
    }
    else if(front==0 && rear==0)
    {
         printf("%d is deleted",queue[front]);
        front=rear=-1;
    }
    else
    {
        printf("%d is deleted",queue[front]);
        front++;
    }
}
void peek()
{
    if(front==-1 && rear==-1)
    {
        printf("Queue is empty");
    }
    else
    {
        printf("%d ",queue[front]);
    }
}
void display()
{
   if(front==-1 && rear==-1)
    {
        printf("Queue is empty");
    }
    else
    {
        for(int i=front;i<=rear;i++)
        {
            printf("%d ",queue[i]);
        }
        
    }
}
int main()
{
    int choice,i;
  while(1)
  {
    printf("\n 1.insert");
    printf("\n 2.delete");
    printf("\n 3.peek");
    printf("\n 4.display");
    printf("\nEnter the choice: ");
    
    scanf("%d",&choice);
 
    switch (choice)
    {
        case 1:
            insert();
            break;
        case 2:
            delete();
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
