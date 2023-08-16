import java.util.*;
import java.lang.*;
public class decrypt 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        int m=s1.length(),n=s2.length();
        char c=' ';
        if(m>n)
        {
            for(int i=0;i<n;i++)
            {
                if(s2.charAt(i)!=s1.charAt(i))
                {
                    System.out.println(s1.charAt(i));
                    c=s1.charAt(i);
                    break;
                }
                else 
                {
                    continue;
                }
            }
        }
        else
        {
            for(int i=0;i<m;i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    System.out.println(s2.charAt(i));
                    c=s2.charAt(i);
                    break;
                }
                else 
                {
                    continue;
                }
            }
        }
        if(c==' ')
        {
            System.out.println("NA");
        }
    }
}