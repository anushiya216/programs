#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*left;
    struct node*right;
}*newnode,*root=NULL;
void create(int n)
{
    int flag=0;
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->left=NULL;
    newnode->right=NULL;
    newnode->data=n;
    if(root==NULL)
    {
        root=newnode;
    }
    else 
    {
        struct node*temp=root,*temp1=root;
        while(1)
        {
            if(temp->left=NULL)
            {
                temp->left=newnode;
                break;
            }
            else if(temp->right=NULL)
            {
                temp->right=newnode;
                break;
            }
            else if(flag==0)
            {
                temp=temp1->left;
                flag=1;
            }
            else 
            {
                temp=temp1->right;
                flag=0;
                temp1=temp1->left
            }
        }
    }
}
int main()
{
    int n;
    do
    {
        scanf("%d",&n);
        create(n);
    }while(n>0);
}