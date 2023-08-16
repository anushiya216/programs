import java.lang.*;
import java.util.*;
public class areaOfCylinder
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        double h=obj.nextFloat();
        double w=obj.nextFloat();
        double t=obj.nextFloat();
        double area2=0.0;
        double r=w/(2*3.14);
        if(r<1)
        {
            System.out.println("Invalid Input");
        }
        else 
        {
            // area=(int)3.14*r*r*h;
            double inner=r-t;
            area2=3.14*inner*inner*h;
            System.out.println(Math.round(area2));
        }
    }
}