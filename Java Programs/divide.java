import java.util.*;
public class divide 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int x=obj.nextInt();
        int y=obj.nextInt();
        for(int i=1;i<n;i++)
        {
            if(i%x==0 && i%y!=0)
            {
                System.out.print(i +" ");
            }
        }
    }
    
}
