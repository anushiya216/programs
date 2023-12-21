import java.util.*;
public class maxNoOfGuestPresent 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=obj.nextInt();
        }
        int count=0,max=0;
        for(int i=0;i<n;i++)
        {
            count=count+arr[i]-arr2[i];
            if(count>max)
            {
                max=count;
            }
        }
        System.out.println(max);
    }
}
