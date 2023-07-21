import java.util.*;
public class fractioncovert
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int o=obj.nextInt();
        int nu=(m*o)+n;
        int de=o;
        if(m==0 || n==0 || o==0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println(nu);
            System.out.println(de);
        } 
    }
}