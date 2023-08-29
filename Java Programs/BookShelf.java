import java.util.*;
public class BookShelf
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n>=30 && n<=50)
        {
            System.out.println("D");
        }
        if(n>=51 && n<=60)
        {
            System.out.println("C");
        }
        else if(n>=61 && n<=80)
        {
            System.out.println("B");
        }
        else if(n>=81 && n<=100)
        {
            System.out.println("A");
        }
    }
}