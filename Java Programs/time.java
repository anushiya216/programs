import java.util.Scanner;
class time{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		int h=obj.nextInt();
		int m=obj.nextInt();
		int s=obj.nextInt();

		if((h<=12 && h>0) && (0<m && m<=59) && (s>0 && s<=59))
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Not Valid");
	}

}
