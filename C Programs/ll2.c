#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* next;

}* newNode,* head, * tail,* temp;

void create()
{
    int n,i;
    printf("enter size: ");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        int element;
        struct node* newNode=(struct node*)malloc(sizeof(struct node));
        printf("enter the value: ");
        scanf("%d",&element);
        if(head==NULL)
        {
            newNode->next= NULL;
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail -> next = newNode;
            newNode-> next = head;
            head = newNode;
        }
    }
}

void insert()
{
    newNode=(struct node *)malloc(sizeof(struct node));
    printf("Enter Data:");
    scanf("%d",&newNode->data);
    newNode->next=head;
    head=newNode;
    printf("inserted");
}

void display()
{
    if(head==NULL)
    {
        printf("The list is empty");
        return;
    }
    temp = head;
    do
    {
        printf("\n%d",temp->data);
        temp=temp->next;
    }while(temp!=head);
}

void  deletee()
{
    temp = head;
    head = head -> next;
    free(temp);
}

int main()
{
    int choice;
    while(1)
    {
        printf("\n 1.create the list");
        printf("\n 2.insert the element");
        printf("\n 3.delete the element");
        printf("\n 4.display");
        printf("\nEnter the choice: ");
        scanf("%d",&choice);
        switch(choice)
        {
        case 1:
            create();
            break;
        case 2:
            insert();
            break;
        case 3:
            deletee();
            break;
        case 4:
            display();
            break;
        default:
            printf("wrong input");
        }
    }
    return 0;
}
