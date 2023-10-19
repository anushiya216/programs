import java.util.*;
public class positiveOrNegative 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                count++;
            }
        }
        if(count>s.length()-count)
        {
            System.out.println("+");
        }
        else if(count==s.length()-count)
        {
            System.out.println("0");
        }
        else 
        {
            System.out.println("-");
        }
    }
}