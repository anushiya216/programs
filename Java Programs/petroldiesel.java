import java.util.*;
public class petroldiesel
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int a1=obj.nextInt();
        int b1=obj.nextInt();
        int c1=obj.nextInt();
        int d1=obj.nextInt();
        int e1=obj.nextInt();
        int a2=obj.nextInt();
        int b2=obj.nextInt();
        int c2=obj.nextInt();
        int d2=obj.nextInt();
        int e2=obj.nextInt();
        int ans1=c1+((d1/a1*b1)*60)+e1*60;
        int ans2=c2+((d2/a2*b2)*60)+e2*60;
        if(ans1<ans2)
        {
            System.out.print("Petrol");
        }
        else 
        {
            System.out.print("Diesel");
        }
    }
}