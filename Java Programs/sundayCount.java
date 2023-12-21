import java.util.*;
public class sundayCount 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String day=obj.nextLine();
        int n=obj.nextInt();
        String days[]={"mon","tues","wed","thur","fri","sat","sun"};
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(days[i].equals(day))
            {
                a=i;
                break;
            }   
        }
        int b=7-a;
        System.out.println(((n-b)/7)+1);
    }
}