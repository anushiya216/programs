import java.util.*;
import java.lang.*;
public class str 
{
    public static void main(String[] args) 
    {
        int i,c=0;
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int d=obj.nextInt();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i+2))
            {
                c=10;
            }
            
        }
        if(c==10)
        {
            System.out.println(s);
        }
    }
}