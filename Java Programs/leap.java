import java.util.*;
public class leap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if(((n%4==0) && (n%100!=0)) || (n%400==0))
		{
			System.out.println("Leap Year");
		}
		else
			System.out.println("Not a Leap Year");
	}

}
