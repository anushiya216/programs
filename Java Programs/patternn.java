import java.util.*;
public class patternn 
{
    public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
        int i;
		char a[]=str.toCharArray();
        for(i=0;i<a.length;i++)
        {
            if(i!=' ')
            {
                System.out.print(a[i]);
            }
            if(i==' ')
            {
                System.out.print(a[i]);
            }
            
        }
    }
}
