import java.util.*;
public class arrcompare 
{
    public static void main(String[] args) 
    {
        int n,i,j;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }   
        for(i=0;i<n;i++)
        {
           for(j=i+1;j<n;j++)
           {
                if(arr[i]<arr[j])
                {
                    System.out.println(arr[i]+"-->"+arr[j]);
                    break;
                }
           }
           if(arr[i]==arr[n-1])
           {
            System.out.println(arr[i]+"-->-1");
           }
        } 
    }
}
