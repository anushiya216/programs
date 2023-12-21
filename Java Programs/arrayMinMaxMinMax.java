import java.util.*;
public class arrayMinMaxMinMax 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        int arr2[]=new int[n];
        int a=arr.length-1,b=0;
        for(int i=0;i<n;i+=2)
        {
            arr2[i]=arr[a]; 
            a--;
        }
        for(int i=1;i<n;i+=2)
        {
            arr2[i]=arr[b];
            b++;
        }
        for(int i:arr2)
        {
            System.out.print(i+" ");
        }
    } 
}