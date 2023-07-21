import java.util.*;
public class minarray {
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int i;
        int n=obj.nextInt();
        int arr[]=new int[n+1];
        
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int ele=obj.nextInt();
        int pos=obj.nextInt();

        for(i = (n-1); i >= (pos-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = ele;
        for(i = 0; i < n; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[n]);
    }
}
    