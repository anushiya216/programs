#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *left, *right;
}*root=NULL;
void append(int n)
{
    int flag=0;
    struct node *newnode;
    newnode=(struct node *)malloc(sizeof(struct node));
    newnode->left=NULL;
    newnode->data=n;
    newnode->right=NULL;
    if(root==NULL)
    {
        root=newnode;
    }
    else
    {
        struct node *temp=root, *temp1=root;
        while(1)
        {
            if(temp->left==NULL)
            {
                temp->left=newnode;
                break;
            }
            else if(temp->right==NULL)
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
                temp1=temp1->left;
            }
        }
    }
}
void inorder(struct node *temp)
{
    if(temp!=NULL)
    {
        inorder(temp->left);
        printf("%d ",temp->data);
        inorder(temp->right);
    }
}
void postorder(struct node *temp)
{
    if(temp!=NULL)
    {
        postorder(temp->left);
        postorder(temp->right);
        printf("%d ",temp->data);
    }
}
void preorder(struct node *temp)
{
    if(temp!=NULL)
    {
        printf("%d ",temp->data);
        preorder(temp->left);
        preorder(temp->right);
    }
}
int sum(struct node *temp)
{
    if(temp==NULL)
    {
        return 0;
    }
    return (temp->data+sum(temp->left)+sum(temp->right));
}
int max(int a, int b)
{
    if(a>b)
    {
        return a;
    }
    else
    {
        return b;
    }
}
int height(struct node *temp)
{
    if(temp==NULL)
        return 0;
    return max(1+height(temp->left),1+height(temp->right));
}
int main()
{
    int n;
    do
    {
        scanf("%d",&n);
        if(n>0)
        {
            append(n);
        }
    }
    while(n>0);
    printf("Inorder: ");
    inorder(root);
    printf("Postorder: ");
    postorder(root);
    printf("Preorder: ");
    preorder(root);
    printf("\n%d",sum(root));
    printf("\n%d",height(root));
    return 0;
}