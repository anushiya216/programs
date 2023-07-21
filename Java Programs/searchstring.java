import java.lang.*;
import java.util.*;
class test
{
        public static void main(String args[])
        {
             Scanner obj=new Scanner(System.in);
             String s =obj.nextLine();
             char ch=obj.next().charAt((0));
            if(s.includes(ch))
            {
                System.out.println("Present");
            }
            else
                System.out.println("Not Present");

        }
}