import java.util.*;
public class pow {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
while(n%2==0)
  {
   n=n/2;
  }
  if(n==1)
  {
   System.out.println("true");
  }
  else
  {
     System.out.println("false");
  }
    }
    
}
