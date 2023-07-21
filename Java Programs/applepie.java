import java.util.*;
import java.io.*;
import java.lang.*;
public class applepie
{
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
    String arr[]={"Apple","Apple","Pie","Pear"};
    String str=arr.toString();
    str.toLowerCase();
    str.replaceAll("\\s","");
    String ques=obj.nextLine();
    ques.toLowerCase();
    if(str.contains(ques))
    {
        System.out.print("True");
    }
    else
    {
        System.out.print("False");
    }
  }
}