import java.util.*;
public class intToAlphabet 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int q=n/26;
        int r=n%26;
        if(q<=26)
        {
            System.out.print((char)(q+64));
        }
        else
        {
            System.out.print((char)((q/26)+64)+""+(char)((q%26)+64));
        }
        System.out.print((char)(r+64)); 
    }  
}