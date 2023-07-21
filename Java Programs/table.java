import java.util.*;
public class table
 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int t=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            int s=i*t;
            System.out.println(i+" * " +t+ " = " +s);
        }
    }
}