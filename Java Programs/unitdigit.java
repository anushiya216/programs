import java.util.*;
public class unitdigit 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int i,j;
        int s=obj.nextInt();
        String a[]=new String[s];
        for(i=0;i<s;i++)
        {
            a[i]=obj.next();
        }
        int n=a.length;
        int arr[][]=new int[n-1][n-1];
        int na='a';
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1;i++)
            {
                arr[i][j]=((int)(a[i][j+1])-(int)(a[i][j]));
            }
        }
        int 
    }
}
