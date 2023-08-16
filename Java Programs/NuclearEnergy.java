import java.util.*;
public class NuclearEnergy 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        System.out.print(a+" ");
        int b=obj.nextInt();
        int c=obj.nextInt();
        for(int i=1;i<c;i++)
        {
           a=a*b;
           System.out.print(a+" ");
        }
    }
}
