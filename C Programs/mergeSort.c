#include<stdio.h>

void mergeSort(int arr[],int beg,int mid,int end); 
void Sort(int arr[],int beg,int end) ; 

int main()
{
    int n,i;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    mergeSort(arr,0,mid,n-1);
    for(int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
}
   
  void mergeSort(int arr[],int beg,int mid,int end)    
  {    
    int i,j,k;  
    int n1=mid-beg+1;    
    int n2=end-mid;    
    int la[n1];
    int ra[n2];
    for(i=0;i<n1;i++)    
    {
        la[i] = arr[beg+i];  
    }  
    for(j=0;j<n2;j++)
    {
        ra[j]=arr[mid+1+j];  
    }    
    i = 0;
    j = 0;   
    k = beg;
    while(i<n1 && j<n2)    
    {    
        if(la[i]<=ra[j])    
        {    
            arr[k]=la[i];    
            i++;    
        }    
        else    
        {    
            arr[k]=ra[j];    
            j++;    
        }    
        k++;    
    }    
    while(i<n1)    
    {    
        arr[k]=la[i];    
        i++;    
        k++;    
    }    
    while(j<n2)    
    {    
        arr[k]=ra[j];    
        j++;    
        k++;    
    }    
  }    
  void Sort(int arr[],int beg,int end)  
  {  
    if(beg<end)   
    {  
        int mid=(beg+end)/2;
        Sort(arr,beg,mid);  
        Sort(arr,mid+1,end);  
        merge(arr,beg,mid,end);  
    }  
  } 
