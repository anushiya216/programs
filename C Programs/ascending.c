#include<stdio.h>
#include<stdlib.h>
struct node
{
  int data;
  struct node *next;
  struct node *prev;
}*head,*temp,*newnode;

void create()
{
    int n,i,val;
    printf("enter size: ");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        printf("enter data:");
        scanf("%d",&val);
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
void output()
{
    int n,count=1;
    temp=head;
    while(temp!=NULL)
    {
        if(temp->next->data > temp->data)
        {
            count+=1;
        }
        temp=temp->next;
    }
    printf("%d",count);
}
void main()
{
    create();
    output();
}