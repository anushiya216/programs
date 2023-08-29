import java.util.*;
public class NegativeNumberCount 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
