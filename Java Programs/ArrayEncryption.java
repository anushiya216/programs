import java.util.*;
public class ArrayEncryption 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int k=obj.nextInt();
        char arr[]=s.toCharArray();
        for(int i=k;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(arr[i]);
        }
    }
    
}
