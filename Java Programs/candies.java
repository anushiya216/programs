import java.util.*;
public class candies 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int need=obj.nextInt();
        if(need>=1 && need<=n-k)
        {
            System.out.println("No.of.candies Required: "+need+"\nNo.of candies available: "+(n-need));
        }
        else 
        {
            System.out.println("Invalid Input...!!! \nNo.of candies available: "+n);
        }
    }   
}