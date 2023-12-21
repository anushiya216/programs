import java.util.*;
public class subStringOccurence
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        int m=s1.length(),n=s2.length();
        int count=0,ans=0;
        for(int i=0;i<=m-n;i++)
        {
            int a=i;count=0;
            for(int j=0;j<n;j++)
            {
                if(s1.charAt(a)==s2.charAt(j))
                {
                    count++;
                    a++;
                }
            }
            if(count==n)
            {
                ans++;
            }
        }
        System.out.println(ans);
    }
}