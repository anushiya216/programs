import java.util.*;

public class duplicateele
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n,i,j;
        n=obj.nextInt();
        int arr[]=new int[n+1];
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    System.out.print(arr[i]);
                    i=n;
                    j=n;
                }
            }
        }
    }    
}

// output
// 7
// 10 5 3 4 3 5 6
// 5
// output 2
// 9
// 6 10 5 4 9 120 4 6 10
// 6