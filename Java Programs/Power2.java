import java.util.*;
public class Power2 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n%2!=0)
        {
            System.out.println("Not a 2 power number");
        }
        else
        {
            n=n>>1;
        }
    }
    
}
