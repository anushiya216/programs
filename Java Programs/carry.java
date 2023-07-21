
import java.util.*;
public class carry {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int m=obj.nextInt();
        int arr2[]=new int[m];
        int i,count=0;
        for (i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for (i=0;i<m;i++)
        {
            arr2[i]=obj.nextInt();
        }
        for(i=m-1;i>=0;i--)
        {
            if(arr[i]+arr2[i]>9)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
