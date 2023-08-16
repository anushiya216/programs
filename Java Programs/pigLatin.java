import java.util.*;
public class pigLatin 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int index=0;
        if(s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u')
        {
            System.out.println(s+"-yay");
        }
        else 
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                {
                    index=i;
                    break;
                }
            }
            for(int i=index;i<s.length();i++)
            {
                System.out.print(s.charAt(i));
            }
            System.out.print("-");
            for(int i=0;i<index;i++)
            {
                System.out.print(s.charAt(i));
            }
            System.out.println("ay");
        }
    }
    
}
