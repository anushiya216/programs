import java.util.*;
public class FindUnlockingKey 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String n=obj.nextLine();
        char arr[]=n.toCharArray();
        Arrays.sort(arr);
        if(arr[0]=='0')
        {
            char temp=arr[0];
            arr[0]=arr[1];
            arr[1]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }    
}
