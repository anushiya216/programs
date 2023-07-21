import java.util.*;
public class year {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int d=obj.nextInt();
        int m=obj.nextInt();
        int y=obj.nextInt();
   
      if(1900<=y || y<=9999)
      {

        if((m==1 || m==3 || m==5 || m==7|| m==8|| m==10 || m==12) && (1<=d && d<=31))
        {
               System.out.println("Valid");
        }
        else if((m==4 || m==6 || m==9 || m==11) && (1<=d && d<=30))
        {
            System.out.println("Valid");
        }
        else if(m==2 && (d<=28 && 1<=d) )
        {
            System.out.println("Not valid");
        }
        else if((m==2 && d<=29) && (y%100!=0 && y%4==0)||y%400==0)
        {
            System.out.println("Valid");
        }   
        else
        {
            System.out.println("Not Valid");
        }
    }
      else
      {
            System.out.println("Not Valid");
      }
    }
}
