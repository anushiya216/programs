import java.util.*;
class strpalindrome

{
        public static void main(String args[])
        {
             Scanner obj=new Scanner(System.in);
             String s=obj.nextLine();
             int i,j;
             char arr[]=s.toCharArray();
             String s1=new String();
             for(i=arr.length-1;i>=0;i--)
             {
                s1=s1+arr[i];
             }
             if(s.equals(s1))
             {
                System.out.println(s + " is a palindrome");
             }
             else
             System.out.println(s + " is not a palindrome");
        }
}