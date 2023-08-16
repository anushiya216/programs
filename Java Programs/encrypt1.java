import java.util.*;
public class encrypt1 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>64 && s.charAt(i)<91) || (s.charAt(i)>47 && s.charAt(i)<58))
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}