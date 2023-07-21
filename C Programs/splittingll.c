#include<stdio.h>
#include<stdlib.h> 
    struct node
    { 
    int data;  
    struct node*next;
    }*head,*temp,*newnode,*tail,*slow,*fast;
    
void create()
{
    int n,val,i;   
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
        tail->next=head; 
    }
}

void middle()
{
    int count=0;
    slow=head;
    fast=head;
    while(fast->next!=head && fast->next->next!=head)   
    {
        fast=fast->next->next;    
        slow=slow->next;     
        count++;   
    }
    slow=slow->next;
}

int main()
{
    int count,i,n;   
    create();  
    middle();   
    temp=head;   
    printf("List 1: ");  
    do   
    {    
        printf("%d ",temp->data);     
        temp=temp->next;   
    }while(temp!=slow);  
    temp=slow;  
    printf("List 2: ");  
    do   
    {   
        printf("%d ",temp->data);    
        temp=temp->next;   
    }while(temp!=head);   
    
    return 0; 
}