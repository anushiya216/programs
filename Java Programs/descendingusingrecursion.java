import java.util.*;
public class descendingusingrecursion 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
      for(int k=0;k<t;k++)
      {
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      }
    }
}
