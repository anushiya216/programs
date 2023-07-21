import java.util.*;
public class photo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the no.of photos:");
        int n=obj.nextInt();
        System.out.print("enter the l value:");
        int l=obj.nextInt();
        System.out.print("enter the width:");
        int w=obj.nextInt();
        System.out.print("enter the height:");
        int h=obj.nextInt();

        if(w<l || h<l)
        {
            System.out.println("UPLOAD ANOTHER");
        }
        else if(w>l || h>l)
        {
            System.out.println("CROP IT");
        }
        else
             System.out.println("ACCEPTED");
    }
}