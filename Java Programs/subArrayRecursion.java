import java.util.*;
public class subArrayRecursion 
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
        int soln[]=new int[n];
        int index=0;
        rec(arr,soln,n,index);
    }
     public static void rec(int arr[],int soln[],int n,int index)
     {
        if(index==n)
        {
            for(int i=0;i<n;i++)
            {
                if(soln[i]==1)
                {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        else 
        {
            soln[index]=1;
            rec(arr,soln,n,index+1);
            soln[index]=0;
            rec(arr,soln,n,index+1);
        }
     }
    
}
