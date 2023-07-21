import java.util.*;
import java.lang.*;

public class vehiclenum 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String m=obj.nextLine();
        int n=obj.nextInt();
        char arr[]=s.toCharArray();
        char arr2[]=m.toCharArray();
        int lc=(int)(arr[1]-arr[0])+1;
        int ln=(int)(arr2[1]-arr2[0])+1;
        int ans=(int)(Math.pow(lc,2));
        int ans2=ln+ln+(ln-1)+(ln-1);
        System.out.print(ans*ans2*n);
    }   
}
