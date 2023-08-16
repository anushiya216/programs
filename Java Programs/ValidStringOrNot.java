import java.util.*;
public class ValidStringOrNot 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if((c>=65 && c<=90) || (c>=97 && c<=122) || (c>=48 && c<=57) || c==' ')
            {
                continue;
            }
            else 
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
