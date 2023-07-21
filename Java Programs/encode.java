import java.util.*;
import java.lang.*;
public class encode
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char arr[]=s.toCharArray();
        int count=1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
            }
            else if(arr[i]!=arr[i+1])
            {
                System.out.print((char)(arr[i])+""+count);
                count=1;
            }
        }
        System.out.print(arr[arr.length-1]+""+count);
    }
}