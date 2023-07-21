#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* next;

}* newNode,* head, * tail,* temp,*max;

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
        newNode->data=element;
        if(head==NULL)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail -> next = newNode;
            newNode-> next = head;
            tail = newNode;
        }
    }
}
void out()
{
    temp=head->next;
    max=head;
    int sum=0;
    do
    {
        if(max->data < temp->data)
        {
            max=max->next;
            sum=max->data+max->next->data;
            temp=temp->next;
            max=max->next;
        }
    } while (temp!=head);
    printf("%d",sum);
}
int main()
{
    create();
    out();
}