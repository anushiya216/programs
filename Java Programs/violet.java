import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.lang.*;
public class violet
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String arr[]={"soup","macaroon","toffee","waffles","taco","french fries","sandwich"};
        String s=obj.nextLine();
        if(s=="sunday")
        {
            System.out.println("soup");
        }
        else if(s=="monday")
        {
            System.out.println("macaroon");
        }
        else if(s=="tuesday")
        {
            System.out.println("toffee");
        }
        else if(s=="wednesday")
        {
            System.out.println("waffles");
        }
        else if(s=="thursday")
        {
            System.out.println("taco");
        }
        else if(s=="friday")
        {
            System.out.println("french fries");
        }
        else if(s=="saturday")
        {
            System.out.println("sandwitch");
        }
        
    }
}