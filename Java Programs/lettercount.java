import java.util.*;
import java.lang.*;
public class lettercount
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char c=obj.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}