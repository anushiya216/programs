import java.util.*;
class reversestr
{
        public static void main(String args[])
        {
             Scanner obj=new Scanner(System.in);
             String s=obj.nextLine();
             char arr[]=s.toCharArray();
             int i;
             String s1=new String();
             for(i=arr.length-1;i>=0;i--)
             {
                s1=s1+arr[i];
             }
             System.out.println(s1);
             
        }
}
