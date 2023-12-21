import java.util.*;
public class zigzagString 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int n=obj.nextInt();
        int c=0;
        if(s.length()%n==0)
        {
            c=s.length()/n;
        }
        else
        {
            c=(s.length()/n)+1;
        }
        char arr[][]=new char[n][c];
        
    }   
}
