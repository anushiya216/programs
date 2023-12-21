import java.util.*;
public class ranking 
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
        int arr2[]=Arrays.copyOf(arr,n);
        Arrays.sort(arr2);
        String arr3[]=new String[n];
        int a=4;
        for(int i=n-4;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(arr2[i]==arr[j])
                {
                    String s=Integer.toString(a);
                    arr3[j]=s+"th";
                    a++;
                    break;
                }
            }  
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==arr2[n-1])
            {
                arr3[i]="Gold medal";
            }
            else if(arr[i]==arr2[n-2])
            {
                arr3[i]="Silver medal";
            }
            else if(arr[i]==arr2[n-3])
            {
                arr3[i]="Bronze medal";
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr3[i]+"  ");
        }
    }
}
