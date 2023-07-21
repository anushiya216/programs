import java.util.*;
import java.lang.*;
public class metastr 
{
  public static void main(String[] args) 
  {
    int i,j,count=0;
    Scanner obj=new Scanner(System.in);
    String s=obj.nextLine();
    String s2=obj.nextLine();
    char arr[]=s.toCharArray();
    char arr2[]=s2.toCharArray();
    int len=s.length();
    int len2=s2.length();
    if(len!=len2)
    {
        System.out.println("No");
    }
    for(i=0;i<len;i++)
    {
        if(arr[i]!=arr2[i])
        {
            count++;
        }
    }
    System.out.println(count);
    if(count>2)
    {
        System.out.println("No");
    }
    else if(count==2)
    {
        System.out.println("Yes");
    }
  }
}
