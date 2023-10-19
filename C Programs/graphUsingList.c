#include<stdio.h>
#include<stdlib.h>
int read_graph(adjList[10],int n);
struct node
{
    int vertex;
    struct node*next;
}*head,*temp,*adjList[10];

void main()
{
    unDirectedGraph();
}
int unDirectedGraph()
{
    int deg,i,j,n;
    printf("\n How many Vertices? ");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        adjList[i]=NULL;
    }
    read_graph(adjList,n);
    printf("\n Vertex \t Degree ");
    for(i=1;i<=n;i++)
    {
        deg=0;
        temp=adjList[i];
        while(temp!=NULL )
        {
            deg++;
            temp=temp->next;
        }
        printf("\n\n %5d \t\t %d\n\n", i, deg);
    }
    return 0;
}

int read_graph(struct node *adjList[10],int n)
{
    int i,j;
    char reply;
    struct node *temp,*c;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(i==j)
                continue;
            printf("\n Vertices %d & %d are Adjacent ? (Y/N) :", i, j);
            scanf("%c", &reply);
            if(reply=='y'||reply=='Y')
            {
                c=(struct node*)malloc(sizeof(struct node));
                c->vertex=j;
                c->next=NULL;
                if(adjList[i]==NULL)
                {
                    adjList[i]=c;
                }                   
                else
                {
                    temp=adjList[i];
                    while(temp->next!=NULL)
                    {
                        temp=temp->next;
                    }    
                    temp->next=c;
                }
            }
        }
    }
    return 0;
}
