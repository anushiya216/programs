import java.util.*;
public class vehicleCount 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int w=sc.nextInt();
        float res=(w-(2*v))/2;
        if(w>=2 && (w%2==0) && v<w)              
            System.out.println("TW= "+(int)(v-res)+" FW= "+(int)(res));
        else                
            System.out.println("INVALID INPUT");
    }
}