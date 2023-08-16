import java.util.*;
public class NegativeTemperature 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int count=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
            if(arr[i]<0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
