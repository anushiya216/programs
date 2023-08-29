import java.util.*;
public class ArrayIndex 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
    
}
