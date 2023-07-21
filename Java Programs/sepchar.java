import java.util.*;
public class sepchar {
  
        public static void main(String args[])
        {
             Scanner obj=new Scanner(System.in);
             String s=obj.nextLine();
             char arr[]=s.toCharArray();
             int i;
             for(i=0;i<s.length();i++)
             {
                System.out.print(arr[i]+" ");
             }
             
        }
}
