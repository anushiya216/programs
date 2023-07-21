#include<stdio.h>
#include<stdlib.h>

void create();
void display();
void count();
void insertfront();
void insertend();
void insertmid();
void exit();


struct node
{
    int data;
    struct node *next;
}*head,*temp,*newnode;

int main()
{
    int option;
    while(1)
    {
        printf("\n\n**Singly Linked List**\n\n");
        printf("1.Create\n");
        printf("2.Display\n");
        printf("3.Count\n");
        printf("4.Insert At Front\n");
        printf("5.Insert At End\n");
        printf("6.Insert At Middle\n");
        printf("7.Exit\n");
        printf("Enter your Choice:(1,2,3,4,5,6,7)\n");
        scanf("%d",&option);
        switch(option)
        {
        case 1:
            create();
            break;
        case 2:
            display();
            break;
        case 3:
            count();
            break;
        case 4:
            insertfront();
            break;
        case 5:
            insertend();
            break;
        case 6:
            insertmid();
            break;
        case 7:
            exit(0);
            break;
        }
    }
}

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

void display()
{
    temp=head;
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
}

void count()
{
    int count=0;
    temp=head;
    while(temp!=NULL)
    {
        temp=temp->next;
        count++;
    }
    printf("\n%d",count);
}

void insertfront()
{
    int val;
    newnode=(struct node *)malloc(sizeof(struct node));
    printf("Enter Data:");
    scanf("%d",&val);
    newnode->data=val;
    newnode->next=head;
    head=newnode;
}

void insertend()
{
    int val;
    newnode=(struct node *)malloc(sizeof(struct node));
    printf("Enter Data:");
    scanf("%d",&val);
    newnode->data=val;
    newnode->next=NULL;
    temp=head;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->next=newnode;
}

void insertmid()
{
    newnode=(struct node *)malloc(sizeof(struct node));
    int pos,val;
    printf("Enter Data:");
    scanf("%d",&val);
    newnode->data=val;
    printf("Enter Position:");
    scanf("%d",&pos);
    for(int i=0; i<pos; i++)
    {
        temp=temp->next;
        newnode->next=temp->next;
        temp->next=newnode;
    }

}