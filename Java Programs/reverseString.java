import java.util.*;
public class reverseString 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char s2[]=s.toCharArray();
        char arr[]=new char[20];
        int a=0,b=0;
        for(int i=s.length();i>=0;i--)
        {
            if(s.charAt(i)!='a'  || s.charAt(i)!='e' || s.charAt(i)!='i' || s.charAt(i)!='o' || s.charAt(i)!='u' )
            {
                arr[a]=s.charAt(i);
                a++;
            }
        }
        for(int i=0;i<s2.length;i++)
        {
            if(s2[i]!='a'  || s2[i]!='e' || s2[i]!='i' || s2[i]!='o' || s2[i]!='u' )
            {
                s2[i]=arr[b];
                b++;
            }
        }
        System.out.print(Arrays.toString(s2) );
    }
}
