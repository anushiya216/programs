import java.util.*;
import java.lang.*;
public class addDashBetweenOddNum 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        StringBuilder res=new StringBuilder(s);
        System.out.println(s.length());
        for(int i=0;i<s.length()-1;i++)
        {
            int n=s.charAt(i)-'0',m=s.charAt(i+1)-'0';
            if((n%2!=0) && (m%2!=0))
            {
                res.insert(i+1,'-');
                s=res.toString();
                i++;
                // System.out.println(res);
            } 
            else if(n%2==0 && m%2==0)
            {
                res.insert(i+1,'*');
                s=res.toString();
                i++;
                // System.out.println(s);
            }
        } 
        System.out.println(s);  
    }   
}