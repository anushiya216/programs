import java.util.*;

class a extends spynum
{
    void sm()
    {
        System.out.println("Spy Number Program");
    }
}
class b extends a
{
    void print()
    {
        int sum=0,mul=1;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        while(n!=0)
        {
            sum+=n%10;
            mul*=n%10;
            n=n/10;
        }
        if(sum==mul)
        {
            System.out.println("Spy Number");
        }
        else 
        {
            System.out.println("Not A Spy Number");
        }
    }
}
public class spynum
{
    public static void main(String[] args) 
    {
        b b=new b();
        b.sm();
        b.print();
    }
}

// input
// 123
// output
// Spy Number