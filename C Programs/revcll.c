#include<stdio.h>
#include<stdlib.h>
struct node
{
  int data;
  struct node *next;
  struct node *prev;
}*head,*temp,*tail,*newnode,*ptr;

void create(int n)
{
  
  for(int i=0;i<n;i++)
  {
    newnode = (struct node*)malloc(sizeof(struct node));
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    if(head==NULL)
    {
      head=newnode;
      temp=newnode;
    }
    else
    {
      temp->next=newnode;
      temp=newnode;
    }
    tail=temp;
    tail->next=head;
  }
}
void reverse(int n)
{
    temp=ptr=head;
    int a=head->data;
    do{
        for(int i=0;i<n-1;i++)
        {
            temp=temp->next;
        }
        ptr->data=temp->data;
        ptr=ptr->next;
    }while(ptr!=head);
    tail->data=a;
}
void display()
{
    do
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }while(temp!=head);
}

int main()
{
    int n;
    scanf("%d",&n);
    create(n);
    reverse(n);
    display();
}

