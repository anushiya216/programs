import java.util.*;
class camelcase
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if (i==0)
			{
				a[i]-=32;
			}
			if(a[i]==' ')
			{
				a[i+1]-=32;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
}