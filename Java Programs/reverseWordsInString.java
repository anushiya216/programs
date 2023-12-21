import java.util.*;
public class reverseWordsInString 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        String arr[]=s.split(".",5);
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}