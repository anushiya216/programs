import java.util.*;
public class pattern {

	public static void main(String[] args) { 
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int i,j,count=1; 
		for(i=1;i<=n-1;i++)
		{
			for(j=1;j<=i;j++)
			{
			
				System.out.print(count +" ");
				count++;
			}
			System.out.println();
		}
	}
}

// input
// 7
// output
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20 21