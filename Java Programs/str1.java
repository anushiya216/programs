import java.util.*;
import java.lang.*;
public class str1 
{
    public static void main(String[] args) 
    {
        int n,i,o;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        String arr[]=new String[n];
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextLine();
        }
        o=obj.nextInt();
        String arr1[]=new String[n];
        for(i=0;i<n;i++)
        {
            arr1[i]=obj.nextLine();
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int m=n+o;
        String marr[]=new String[m];
        for(i=0;i<n;i++)
        {
           marr[i]=arr[i];
        }
        for(i=0;i<o;i++)
        {
           marr[n+i]=arr1[i];
        }
        Arrays.sort(marr);
        for(i=0;i<m;i++)
        {
           System.out.println(marr[i]);
        }
    }
}