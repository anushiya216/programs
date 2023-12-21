import java.util.*;
class eachWordCamelCase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c[]=str.toCharArray();
        int n=c.length;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                c[i]=(char)((int)c[i]-32);
            }
            if(c[i]==' ' )
            {
                if((int)(c[i-1])>=97 && (int)(c[i-1])<=122)
                {
                    c[i-1]=(char)((int)c[i-1]-32);
                }
                if((int)(c[i+1])>=97 && (int)(c[i+1])<=122)
                {
                    c[i+1]=(char)((int)c[i+1]-32);
                } 
            }
            if(i==n-1)
            {
                c[i]=(char)((int)c[i]-32);
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(c[i]);
        }
    }
}