import java.util.*;
import java.lang.*;
public class patterns
{
  public static void main(String[] args) 
  {
    String str=new String("Hello");
    String str1=new String("hello");
    System.out.println(str.equals(str1));
    System.out.println(str.equalsIgnoreCase(str1));
    System.out.println(str.concat(str1));
    System.out.println(str1.substring(1,4));
    System.out.println(str.replace('l','a'));
    System.out.println(str.contains(str1));
    System.out.println(str.indexOf('l'));
    System.out.println(str.indexOf('l',4));
    System.out.println(str.endsWith("llo"));
  }
}

// output
// false
// true
// Hellohello
// ell
// Heaao
// false
// 2
// -1
// true
