import java.util.*;
public class Terrorist 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String k=obj.nextLine();
        char arr[]=k.toCharArray();
        char arr2[]=new char[arr.length];
        int l=0,ans=0,count=0;
        for(int i=0;i<=s.length()-k.length();i++)
        {
            l=0;ans=0;
            for(int j=i;j<i+k.length();j++)
            {
               arr2[l++]=s.charAt(j);
            }
            for(int d=0;d<k.length();d++)
            {
                if(arr[d]==arr2[d])
                {
                    ans++;
                }
            }
            if(ans==k.length())
            {
                count++;
            }
        }
        System.out.println(count);
    }    
}