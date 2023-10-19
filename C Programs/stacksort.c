#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node*next;
}*top,*temp,*newnode,*ptr;

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
void display()
{
    temp=top;
    while(temp!=NULL)
    {
        printf("%d",temp->data);
        temp=temp->next;
    }
}
int main()
{
    int i;
    create(); 
    ptr=top->next;
  while(temp!=NULL)
  {

    if(top->data < ptr->data)
    {
        top=top->next;
        ptr=ptr->next;
    }
    else
    {
        top->data=ptr->data;
        ptr->data=top->data;
        top=top->next;
        ptr=ptr->next;
    }
  }
    top=temp;
   display();
}
