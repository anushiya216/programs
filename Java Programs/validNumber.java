import java.util.*;
public class validNumber.java
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        if(s.charAt(0)=='e' || s.charAt(0)=='E' || s.charAt(0)=='.')
        {
            System.out.println("False");
        }
        else if(s.charAt(0)=='+' || s.charAt(0)=='-')
        {
            for(int i=1;i<s.length();i++)
            {
                if(s.charAt(i)=='e' || s.charAt(i)=='E')
                {
                    for(int j=i+1;j<s.length();j+=)
                    {
                        if(s.charAt(i)=='.')
                        {
                            System.out.println("False");
                            break;
                        }
                    }
                }
            }
        }
    }
}