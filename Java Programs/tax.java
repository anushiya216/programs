import java.util.*;
public class tax 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>1000)
            {
                sum+=(arr[i]-1000)/10;
            }
        }
        System.out.println(sum);
            
        
    }
}
