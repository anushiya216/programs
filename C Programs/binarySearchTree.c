#include <stdio.h>
#include <stdlib.h>
struct node
{
	int key;
	struct node *left, *right;
};
struct node* newNode(int item)
{
	struct node* temp = (struct node*)malloc(sizeof(struct node));
	temp->key = item;
	temp->left = temp->right = NULL;
	return temp;
}
struct node* insert(struct node* node, int key)
{
	if (node == NULL)
		return newNode(key);
	if (key < node->key)
	{
		node->left = insert(node->left, key);
	}
	else if (key > node->key)
    {
		node->right = insert(node->right, key);
	}
	return node;
}
void inorder(struct node* root)
{
	if (root != NULL)
    {
		inorder(root->left);
		printf("%d ", root->key);
		inorder(root->right);
	}
}
void preorder(struct node* root)
{
	if (root != NULL)
    {
		printf("%d ", root->key);
		preorder(root->left);
		preorder(root->right);
	}
}
void postorder(struct node* root)
{
	if (root != NULL)
    {
		postorder(root->left);
		postorder(root->right);
		printf("%d ", root->key);
	}
}
struct node* search(struct node* root, int item)
{
    if (root == NULL || root->key == item)
        return root;

    if (item < root->key)
        return search(root->left, item);

    return search(root->right, item);
}
struct node* deleteNode(struct node* root, int k)
{
    // Base case
    if (root == NULL)
        return root;
    // Recursive calls for ancestors of node to be deleted
    if (k < root->key){
        root->left = deleteNode(root->left, k);
        return root;}
    else if (k > root->key){
        root->right = deleteNode(root->right, k); 
        return root;}
    // We reach here when root is the node to be deleted.
    // If one of the children is empty
    if (root->left == NULL){
        struct node* temp = root->right;
        free(root);
        return temp;}
    else if (root->right == NULL){
        struct node* temp = root->left;
        free(root);
        return temp;}
    // If both children exist
    // Find the inorder successor (smallest in the right subtree)
    struct node* succParent = root;
    struct node* succ = root->right;
    while (succ->left != NULL){
        succParent = succ;
        succ = succ->left;}
    // Copy Successor Data to root
    root->key = succ->key;
    // Recursively delete the successor node
    root->right = deleteNode(root->right, succ->key);
    return root;
}

int main()
{
    struct node*root=NULL;
    int no_of_nodes,data,i,item,k;
    scanf("%d",&no_of_nodes);
    root=insert(root,50);
    for(i=0;i<no_of_nodes;i++)
    {
        scanf("%d",&data);
        insert(root,data);
    }
    printf("\nInorder traversal: ");
    inorder(root);
    printf("\nPreorder traversal: ");
    preorder(root);
    printf("\nPostorder traversal: ");
    postorder(root);
    printf("\nEnter an element to be searched: ");
    scanf("%d",&item);
    struct node *res=search(root,item);
    if(res!=NULL)
        printf("Element found");
    else
        printf("Not found");
    printf("\nEnter an element to be deleted: ");
    scanf("%d",&k);
    root=deleteNode(root,k);
    printf("Modified BST tree after deleting both child Node:\n");
    inorder(root);
    return 0;
}
