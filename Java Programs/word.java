import java.util.*;
import java.io.*;
public class word {
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        n=n+1;
        String arr[]=new String[n];
        String a="";
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextLine();
        }
        int ans=0,max=0;
        for(i=0;i<n;i++)
        {
            int len=arr[i].length();
            if(len%2==1)
            {
                if(len>max)
                {
                    max=len;
                    ans=10;
                    a=arr[i];
                }
            }
            else 
            {
                ans=1;
            }
        }
        if(ans==10)
        {
            System.out.print(a);
        }
        else 
        {
            System.out.println("Better Luck Next Time");
        }
    }
}