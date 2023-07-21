import java.util.*;
public class lcm
 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int i,gcd=0,a=0;
        for(i=1;i<=n;i++)
        {
            if(m%i==0 && n%i==0)
            {
                gcd=i;
                a=m*n/gcd;
            }
        }
        System.out.println(a);
    }
 }
            

