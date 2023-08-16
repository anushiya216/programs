import java.util.*;
public class ArrangeList 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==1)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}