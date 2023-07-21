import java.util.*;
import java.lang.*;
public class lab 
{
    public static void main(String[] args) 
    {
        int i,count=0;
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String str=s.toUpperCase();
        int len=s.length();

        for(i=0;i<len-1 ;i++){
           if(str.charAt(i)==str.charAt(i+1))
                count=count+2;
        }
        
        System.out.println(str.length()-count);
    }

}