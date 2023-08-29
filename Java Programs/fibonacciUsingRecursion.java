import java.util.*;
public class fibonacciUsingRecursion 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n)
    {
        if(n<=1)
        {
           return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
