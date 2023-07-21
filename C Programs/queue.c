#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node*next;
}*top,*temp,*newnode,*front=NULL,*rear=NULL;

void enqueue()
{
    int val,i,n;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        scanf("%d",&val);
        newnode->data=val;
        newnode->next=front;
         if(front==NULL && rear ==NULL)
        {
            front=newnode;
            rear=newnode;
        }
        else
        {
            rear->next=newnode;
            rear=newnode;
        }
    }
    printf("\n elements are inserted into Queue");    
}
void dequeue()
{
    if(front==NULL && rear==NULL)
    {
        printf("Queue is empty");
    }
    else
    {
        temp=front;
        printf("%d is deleted",temp->data);
        front=front->next;
        free(temp);
    }
}
void peek()
{
    if(front==NULL && rear==NULL)
    {
        printf("Queue is empty");
    }
    else
    {
        printf("%d ",front->data);
    }
}
void display()
{
    
    if(front==NULL && rear==NULL)
    {
        printf("Queue is empty");
    }
    else
    {
        temp=front;
        while(temp!=NULL)
        {
            printf("%d ",temp->data);
            temp=temp->next;
        }
        
    }
}
int main()
{
    top=NULL;
    
    int choice;
  while(1)
  {
    printf("\n 1.enqueue");
    printf("\n 2.dequeue");
    printf("\n 3.peek");
    printf("\n 4.display");
    printf("\nEnter the choice: ");
    
    scanf("%d",&choice);
 
    switch (choice)
    {
        case 1:
            enqueue();
            break;
        case 2:
            dequeue();
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
