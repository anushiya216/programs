import java.util.*;
public class trap 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n,i;
        n=obj.nextInt();
        int b[]=new int[n+1];
        for(i=0;i<n;i++)
        {
            b[i]=obj.nextInt();
        }
        int r=n-2;
        int m=b[0];
        int s=b[n-1];
            if(m<s)
            {
                System.out.println(m*r);
            }
            else if(m>s)
            {
                System.out.println(s*r);
            }
            else if(m==s)
            {
                System.out.println(m*r);
            }
    }    
}
