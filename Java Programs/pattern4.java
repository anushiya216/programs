import java.util.*;

public class pattern4
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    int t=obj.nextInt();
    for(int i=0;i<t;i++)
    {
	    int n=obj.nextInt();
	    pattern(n);
    }
  }
  public static void pattern(int n)
  {
    int s=n*2;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=s;j++)
        {
	        if(i<j && j<=s-i)
	        {
		        System.out.print("# ");
	        }
	        else
	        {
		        System.out.print("* ");
	        }
        }
        System.out.println();
    }
  }
}

// input
// 3
// 9 
// 2
// 5
// output
// * # # # # # # # # # # # # # # # # *
// * * # # # # # # # # # # # # # # * *
// * * * # # # # # # # # # # # # * * *
// * * * * # # # # # # # # # # * * * *
// * * * * * # # # # # # # # * * * * *
// * * * * * * # # # # # # * * * * * *
// * * * * * * * # # # # * * * * * * *
// * * * * * * * * # # * * * * * * * *
// * * * * * * * * * * * * * * * * * *

// * # # *
// * * * *

// * # # # # # # # # *
// * * # # # # # # * *
// * * * # # # # * * *
// * * * * # # * * * *
// * * * * * * * * * *