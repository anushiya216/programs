import java.util.*;
public class MergeSort 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        Sort(arr,0,n-1);  
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
   
  public static void merge(int arr[],int beg,int mid,int end)    
  {    
    int i,j,k;  
    int n1=mid-beg+1;    
    int n2=end-mid;    
    int la[]=new int[n1];
    int ra[]=new int[n2];
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
  public static void Sort(int arr[],int beg,int end)  
  {  
    if(beg<end)   
    {  
        int mid=(beg+end)/2;  
        // System.out.println(mid);
        Sort(arr,beg,mid);  
        Sort(arr,mid+1,end);  
        merge(arr,beg,mid,end);  
    }  
  } 
}