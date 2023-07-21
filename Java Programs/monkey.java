import java.util.*;
public class monkey 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int j=obj.nextInt();
        int m=obj.nextInt();
        int p=obj.nextInt();
        int rem=m%k;
        int q=m/k;
        int mc=0,r=0;
        int q2=p/j;
        int rem2=p%j;
        if(rem!=0 || rem2!=0)
        {
            r=1;
        }
        mc=q+q2+r;
        int ans=n-mc;
        System.out.print(ans);
    }
}
