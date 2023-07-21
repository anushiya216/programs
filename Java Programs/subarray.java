import java.util.*;
public class subarray 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=5,i,j,k;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for (i=0; i <n; i++)
        {
            for (j=i; j<n; j++)
            {
                for (k=i; k<=j; k++)
                {
                    System.out.print(arr[k]+" ");
                }
            }
        }
    }
}


// output

// 2 3 1 4 5
// 2 2 3 2 3 1 2 3 1 4 2 3 1 4 5 3 3 1 3 1 4 3 1 4 5 1 1 4 1 4 5 4 4 5 5 