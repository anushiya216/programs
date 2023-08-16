import java.util.*;
public class testing1 {
	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
        {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i=1;i<n;i++) 
        {
			int flag=0;
			for (int j =0;j<n; j++) 
            {
			    if (arr[j]==i) 
                {
			        flag= 1;
			        break;
			    }
			}
			if (flag==0) 
            {
			    System.out.println(i+" ");
			    break;
			}
		}
	}
}