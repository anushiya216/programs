import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int i,count=0;
        for(i=0;i<=n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(i=0;i<n+1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                count++;
            }
            else
            {
                count=count;
            }
        }
    }
}