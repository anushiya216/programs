import java.util.*;
public class ExistNumCount 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int count=0;
        while(n>9)
        {
            int r=n%10;
            if(r==k)
            {
                count++;
            }
            n=n/10;
        }
        if(n==k)
        {
            count++;
        }
        System.out.println(count);
    }
    
}
