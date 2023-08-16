import java.util.*;
public class LetterCountInString 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char k=obj.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(k==s.charAt(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}