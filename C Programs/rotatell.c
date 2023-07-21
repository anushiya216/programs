#include<stdio.h>
#include<stdlib.h>


struct Node
{
  int data;
  struct Node *next;
}*head,*temp,*newnode;


void create()
{
    int n,i,val;
    printf("enter size: ");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        newnode=(struct node*)malloc(sizeof(struct node*));
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

void display (struct Node *node)
{
  while (node != NULL)
    {
      printf ("%d ", node->data);
      node = node->next;
    }
  printf ("\n");
}

void delete_Alt (struct Node *head)
{
  if (head == NULL)
    return;

  // prev req so its next node can be changed
  struct Node *prev = head;
  struct Node *curr = head->next;

  while (prev != NULL && curr != NULL)
    {
      // changing next of previous node
      prev->next = curr->next;

      // free the memory
      free (curr);

      // Update prev and curr 
      prev = prev->next;
      if (prev != NULL)
	curr = prev->next;
    }
}

int main ()
{
    create();

  delete_Alt (head);

  display (head);
  return 0;
}