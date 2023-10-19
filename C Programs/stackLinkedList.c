#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node*next;
}*top,*temp,*newnode;

void create()
{
    int i,n,val;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        scanf("%d",&val);
        newnode->data=val;
        newnode->next=NULL;
        if(top==NULL)
        {
            top=newnode;
            temp=newnode;
        }
        else
        {
            newnode->next=top;
            top=newnode;
        }
        
    }
    printf("stack is created");
}

void push()
{
    int val;
        newnode=(struct node*)malloc(sizeof(struct node));
        scanf("%d",&val);
        newnode->data=val;
        newnode->next=top;
        top=newnode;
}
void pop()
{
    if(top== NULL)
    {
        printf("Stack is empty");
    }
    else
    {
        temp=top;
        top=top->next;
        free(temp);
    }
}
void peek()
{
    if(top== NULL)
    {
        printf("Stack is empty");
    }
    else
    {
        printf("%d ",top->data);
    }
}
void display()
{
    temp=top;
    if(top== NULL)
    {
        printf("Stack is empty");
    }
    else
    {
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
    printf("\n\n 1.create the stack");
    printf("\n 2.push");
    printf("\n 3.pop");
    printf("\n 4.peek");
    printf("\n 5.display");
    printf("\nEnter the choice: ");
    scanf("%d",&choice);
 
    switch (choice)
    {
        case 1:
            create();
            break;
        case 2:
            push();
            break;
        case 3:
            pop();
            break;
        case 4:
            peek();
            break;
        case 5:
            display();
            break;
        default:
            printf("wrong input");
    }
  }
}