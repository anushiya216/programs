import java.util.*;
import java.lang.*;
public class surfaceAreaOfWall 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n2=obj.nextInt();
        int c1=18,c2=12;
        float cost=0;
        for(int i=0;i<n;i++)
        {
            float m=obj.nextFloat();
            cost=cost+(m*c1);
        }
        for(int i=0;i<n2;i++)
        {
            float m=obj.nextFloat();
            cost=cost+(m*c2);
        }
        System.out.print(Math.ceil(cost));
    }
    
}
