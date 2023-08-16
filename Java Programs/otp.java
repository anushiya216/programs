import java.util.*;
public class otp 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=1;
        while(n>10)
        {
            sum*=n%((n/10)*10);
            n=n/10;
        }
        System.out.println(sum*n);
    }
}
