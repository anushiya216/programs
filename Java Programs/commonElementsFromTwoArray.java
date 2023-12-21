import java.util.*;
public class commonElementsFromTwoArray 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int arr[]=new int[m];
        int arr2[]=new int[n];
        for(int i=0;i<m;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=obj.nextInt();
        }
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr2[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
