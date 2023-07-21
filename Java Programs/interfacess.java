import java.util.*;
import java.lang.*;
import java.io.*;
interface one
{
    void geek();
}
interface two
{
    void forr();
}
interface three extends one,two
{
    void geek();
}
class add implements three
{
    public void geek()
    {
        System.out.println("geeks");
    }
    public void forr()
    {
        System.out.println("for");
    }
}

public class interfacess
{
  public static void main(String[] args) 
  {
    add a=new add();
    a.geek();
    a.forr();
    a.geek();
  }
    
}
