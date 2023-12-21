import java.util.*;
public class programPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        if(n%2!=0) {
        	for(int i=0;i<n;i++) {
        		int j=n-1-i; 
    			for (int k=0;k<n;k++) { 
    				if (k==i||k==j) 
    					System.out.print(str.charAt(k)); 
    				else
    					System.out.print(" "); 
    			} 
    			System.out.println("");
        	}
        }
	}
}