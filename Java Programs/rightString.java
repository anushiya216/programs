import java.util.Scanner;

public class rightString 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        String s2="True";
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(0)>=97 && s.charAt(0)<=102)
            {
                if(s.charAt(i)<97 || s.charAt(i)>102)
                {
                    s2="False";
                    break;
                }
            }
            else if(s.charAt(0)>=65 && s.charAt(0)<=91)
            {
                if(s.charAt(1)>=97 && s.charAt(1)<=102)
                {
                    if(s.charAt(i)<97 && s.charAt(i)>102)
                    {
                        s2="False";
                        break;
                    }
                }
                else if(s.charAt(1)>=65 && s.charAt(1)<=91)
                {
                    if(s.charAt(i)>=97 && s.charAt(i)<=102)
                    {
                        s2="False";
                        break;
                    }
                }
            }
        }
        System.out.println(s2);
    }
}