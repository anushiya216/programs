import java.util.*;
public class CountOfSpecialCharNWhiteSpace 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int count=0;
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==' ')
            {
                count++;
            }
            else if(arr[i]<48 && arr[i]>57 && arr[i]>90 && arr[i]<65 && arr[i]<97 && arr[i]>122)
            {
                count++;
            }
        }   
        System.out.println(count);     
    }
}