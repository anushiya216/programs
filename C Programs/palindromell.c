#include<stdio.h>
#include<stdlib.h>
struct node
{
  int data;
  struct node *next;
  struct node *prev;
}*head,*temp,*newnode,*slow,*fast,*tail;

void create()
{
    int n,i;
    char val;
    printf("enter size: ");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        printf("enter data:");
        scanf("%c ",&val);
        newnode->data=val;
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
    }
}
void middle()
{  
    slow=head;   
    fast=head; 
    while(fast->next!=head && fast->next->next!=head)
    {             
        fast=fast->next->next;     
        slow=slow->next;  
    }
}
slow=slow->next;


void main()
{
    create();
    if(head->data==temp->data && head->next->data==slow->next->data)
    {
        printf("Yes");
    }
    else 
    {
        printf("No");
    }
}