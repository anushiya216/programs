import java.util.Scanner;
import java.lang.*;
public class validIPAddress 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int c=0,flag=0;;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            {
                c++;
            }
        }
        if(c!=3)
        {
            flag=1;
            System.out.println("INVALID IP Address");
        }
        else 
        {
            String arr[]=s.split("\\.",4);
            for(int i=0;i<4;i++)
            {
                String s1=arr[i];
                if(s1.charAt(0)=='0')
                {
                    flag=1;
                    System.out.println("INVALID IP Address");
                    break;
                }
                else
                {
                    int n=Integer.parseInt(s1);
                    System.out.println(n);
                    if(n<0 || n>255)
                    {
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0)
            {
                System.out.println("VALID IP Address");
            }
        }
    }   
}