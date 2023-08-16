import java.util.*;
public class ServerLoad 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i=i+2)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    
}
