import java.util.*;
public class reverseConsonent 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char arr[]=s.toCharArray();
        int a=arr.length;
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i]!='a' || arr[i]!='e' || arr[i]!='i' || arr[i]!='o' || arr[i]!='u')
            {
                for(int j=a;j>=arr.length/2;j--)
                {
                    if(arr[j]!='a' || arr[j]!='e' || arr[j]!='i' || arr[j]!='o' || arr[j]!='u')
                    {
                        char temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        a--;
                        break;
                    }
                }
            }
        }
        System.out.println(s);
    }
    
}
