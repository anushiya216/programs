import java.util.*;
public class division
 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int count=0;
        while(m>=0)
        {
            m-=n;
            count++;
        }
        if(m==0)
        {
            System.out.println(count);
        }
        else
            System.out.println(count-1);
    }
 }
