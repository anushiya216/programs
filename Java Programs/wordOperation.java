import java.util.*;
import java.lang.*;
public class wordOperation 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        String s3=obj.nextLine();
        char arr1[]=s1.toCharArray();
         char arr2[]=s2.toCharArray();
          char arr3[]=s3.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u' || s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U' )
            {
                arr1[i]='%';
                System.out.print(arr1[i]);
            }
            else 
            {
                System.out.print(arr1[i]);
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)!='a' && s2.charAt(i)!='e' && s2.charAt(i)!='i' && s2.charAt(i)!='o' && s2.charAt(i)!='u' && s2.charAt(i)!='A' && s2.charAt(i)!='E' && s2.charAt(i)!='I' && s2.charAt(i)!='O' && s2.charAt(i)!='U')
            {
                arr2[i]='#';
                System.out.print(arr2[i]);
            }
            else 
            {
                System.out.print(arr2[i]);
            }
        }
        for(int i=0;i<s3.length();i++)
        {
            arr3[i]-=32;
            System.out.print(arr3[i]);
        }
    }  
}