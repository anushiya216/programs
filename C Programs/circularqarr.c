#include<stdio.h>
#define max 5
int arr[max];
int front=-1;
int rear=-1;

void enqueue()
{
    if((rear+1)%max==front)
    {
        printf("Overflow");
    }
    else 
    {
        int n,i,val;
        printf("No.Of.Elements:");
        scanf("%d",&n);
        for(i=0;i<n;i++)
        {
            scanf("%d",&val);
            if(front==-1 && rear==-1)
            {
                front=0;
                rear=0;
                arr[rear]=val;
            }
            else if((rear+1)%max==front)
            {
                printf("Overflow");
            }
            else 
            {
                rear=(rear+1)%max;
                arr[rear]=val;
            }   
        } 
    }
}
void dequeue()
{
    if(front==-1 && rear==-1)
    {
        printf("Queue is empty");
    }
    else if(front==rear)
    {
        front=rear=-1;
    }
    else 
    {
        front=(front+1)%max;
    }   
}
void display()
{
    int i=front;
    if(front==-1 && rear==-1)
    {
        printf("Queue is empty");
    }
    else
    {
        while(i!=rear+1)
        {
            printf("%d ",arr[i]);
            i=(i+1)%max;
        }
    }
}

int main()
{
    int choice;
    while(1)
    {
        printf("\n 1.Enqueue");
        printf("\n 2.Dequeue");
        printf("\n 3.Display the elements");
        printf("\nEnter the choice: ");
        scanf("%d",&choice);
        switch(choice)
        {
        case 1:
            enqueue();
            break;
        case 2:
            dequeue();
            break;
        case 3:
            display();
            break;
        default:
            printf("wrong input");
        }
    }
}