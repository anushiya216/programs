import java.util.*;
public class LargestTriangle 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int b1=obj.nextInt();
        int h1=obj.nextInt();
        int b2=obj.nextInt();
        int h2=obj.nextInt();
        float area1=(b1*h1)/2;
        float area2=(b2*h2)/2;
        if(area2>area1)
        {
            System.out.println(area2);
        }
        else 
        {
            System.out.println(area1);
        }
    }
    
}
