import java.util.*;
public class vowelConsonantReplace 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        String s3=obj.nextLine();
        s3=s3.toUpperCase();
        char arr[]=new char[s1.length()+s2.length()+s3.length()];

        for(int i=0;i<s1.length();i++)
        {
            if((s1.charAt(i)>96 && s1.charAt(i)<122) || (s1.charAt(i)>64 && s1.charAt(i)<92))
            {
                if(s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U' || s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
                {
                    arr[i]='%';
                }
                else 
                {
                    arr[i]=s1.charAt(i);
                }
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            if((s2.charAt(i)>96 && s2.charAt(i)<122) || (s2.charAt(i)>64 && s2.charAt(i)<92))
            {
                if(s2.charAt(i)!='A' && s2.charAt(i)!='E' && s2.charAt(i)!='I' && s2.charAt(i)!='O' && s2.charAt(i)!='U' && s2.charAt(i)!='a' && s2.charAt(i)!='e' && s2.charAt(i)!='i' && s2.charAt(i)!='o' && s2.charAt(i)!='u')
                {
                    arr[i+s1.length()]='#';
                }
                else 
                {
                    arr[i+s1.length()]=s2.charAt(i);
                }
            }
        }
        for(int i=0;i<s3.length();i++)
        {
            arr[i+s1.length()+s2.length()]=s3.charAt(i);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }  
}
