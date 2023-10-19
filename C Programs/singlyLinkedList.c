#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* next;
}*newnode,*head, *tail,*temp;

void create()
{
    int n,val,i;  
    printf("Enter the size: "); 
    scanf("%d",&n);
    for(i=0;i<n;i++)   
    {  
        newnode=(struct node*)malloc(sizeof(struct node));   
        scanf("%d",&val);  
        newnode->data=val;   
        newnode->next=NULL;    
        if(head==NULL)
        {
            head=newnode;      
            tail=newnode;   
        }   
        else
        {
            tail->next=newnode;     
            tail=newnode; 
        }
    }
}
void insertMid()
{
    newnode=(struct node*)malloc(sizeof(struct node)); 
    printf("Enter the element: "); 
    scanf("%d",&newnode->data);
    newnode->next=head;
    head=newnode;
}
void insertEnd()
{
    newnode=(struct node*)malloc(sizeof(struct node)); 
    printf("Enter the element: "); 
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    tail->next=newnode;
    tail=newnode;
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

int main()
{   
    create();
    insertMid();
    insertEnd();
    display();
}