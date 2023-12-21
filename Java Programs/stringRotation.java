import java.util.*;
public class stringRotation 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String s2=obj.nextLine();
        char arr[]=s.toCharArray();
        char arr2[]=s2.toCharArray();
        int count=0;
        for(int i=0;i<2;i++)
        {
            char temp=arr[0];
            for(int j=1;j<arr.length;j++)
            {
                arr[j-1]=arr[j];
            }
            arr[(arr.length)-1]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr2[i])
            {
                count++;
            }
        }
        arr=s.toCharArray();
        for(int i=0;i<2;i++)
        {
            char temp=arr[(arr.length)-1];
            for(int j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        int count2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr2[i])
            {
                count2++;
            }
        }
        if(count2==arr.length || count==arr.length)
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
    }
    
}
