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

int main()
{
    linkedlist
    create();
    create();
    return 0;
}
