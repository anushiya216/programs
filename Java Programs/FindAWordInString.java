import java.util.*;
public class FindAWordInString 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String arr[]=new String[n+1];
        int flag=0;
        for(int i=0;i<n+1;i++)
        {
            arr[i]=obj.nextLine();
        }
        String s=obj.nextLine();
        for(int i=0;i<n+1;i++)
        {
            String s2=arr[i];
            if(s2.equals(s))
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Found");
        }
        else 
        {
            System.out.println("Not Found");
        }
    }
    
}
