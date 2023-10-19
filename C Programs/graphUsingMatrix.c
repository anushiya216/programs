#include<stdio.h>
#define v 5
void init(int adjMatrix[v][v]);
void addEdge(int adjMatrix[v][v],int i,int j);
void printAdjMatrix(int adjMatrix[v][v]);
int main()
{
    int adjMatrix[v][v];
    init(adjMatrix);
    addEdge(adjMatrix,1,2);
    addEdge(adjMatrix,1,3);
    addEdge(adjMatrix,1,4);
    addEdge(adjMatrix,2,3);
    addEdge(adjMatrix,2,5);
    addEdge(adjMatrix,3,4);
    printAdjMatrix(adjMatrix);
    return 0;
}
void init(int adjMatrix[v][v])
{
    int i,j;
    for(i=1;i<=v;i++)
    {
        for(j=1;j<=v;j++)
        {
            adjMatrix[i][j]=0;
        }
    }
}
void addEdge(int adjMatrix[v][v],int i,int j)
{
    adjMatrix[i][j]=1;
    adjMatrix[j][i]=1;
}
void printAdjMatrix(int adjMatrix[v][v])
{
    for(int i=1;i<=v;i++)
    {
        printf("\n%d : ",i);
        for(int j=1;j<=v;j++)
        {
            printf("%d ",adjMatrix[i][j]);
        }
    }
}