import java.util.*;
public class Main
{
public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    int b=obj.nextInt();
    int c=obj.nextInt();
    int d=obj.nextInt();
    int e=obj.nextInt();
    int f=obj.nextInt();
    int g=obj.nextInt();
    int h=obj.nextInt();
    int i=obj.nextInt();
    int j=obj.nextInt();
     A obj1 = new A(a,b,c,d,e);
     System.out.println(obj1.getPercentage());
     B obj2 = new B(f,g,h,i,j);
     System.out.println(obj2.getPercentage());
}
}
abstract class Marks {
public abstract float getPercentage();
}
class A extends Marks
{
     int marks1, marks2, marks3,marks4,marks5;
     A(int m1, int m2, int m3 ,int m4,int m5)
     {
          marks1=m1;
          marks2=m2;
          marks3=m3;
          marks4=m4;
          marks5=m5;
     }
     public float getPercentage()
     {
          float total=((marks1+marks2+marks3+marks4+marks5)/(float)500)*100;
          return total;
     }
}
class B extends Marks
{
     int marks1, marks2, marks3, marks4,marks5;
     B(int m1, int m2, int m3, int m4,int m5)
     {
          marks1=m1;
          marks2=m2;
          marks3=m3;
          marks4=m4;
          marks5=m5;
     }
     public float getPercentage()
     {
          float total=((marks1+marks2+marks3+marks4+marks5)/(float)500)*100;
          return total;
     }
}
