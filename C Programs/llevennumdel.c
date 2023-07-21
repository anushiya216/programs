#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
}*head,*temp,*newnode,*tail,*a,*prev;

void create();
void ans();
void display();

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
            head=newnode=prev=tail;
            temp=newnode;
        }
        else
        {
            temp->next=newnode;
            temp=newnode;
        }
    }
}

void ans()
{
    temp=head=prev;
    int count=0;
    while(temp!=NULL)
    {
        if(temp->data%2==0)
        {
        tail=temp;
        temp=temp->next;
        if(tail->next!=NULL)
        {
            if(prev==NULL)
            {
                head=tail->next;
            }
            else{
                prev->next=tail->next;
            }
            free(tail);
        count++;
        prev=prev->next;
        }
        else 
    {
        prev=temp;
        temp=temp->next;
    }
        
        
        }
       
        else 
        {
            temp=temp->next;
        }
    }
    printf("\ncount of removed nodes= %d\n",count);
}
void display()
{
    temp=head;
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
}

   
void main()
{
    create();
    ans();
    display();
}
