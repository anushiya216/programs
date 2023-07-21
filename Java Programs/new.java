public class Quadrilateral
{
protected int x1,x2,x3,x4,y1,y2,y3,y4;
protected void setCoordinate(int a,int b,int c,int d,int e,int f,int g,int h)
{
x1=a;
y1=b;
x2=c;
y2=d;
x3=e;
y3=f;
x4=g;
y4=h;
}
}

public class Square extends Quadrilateral
{
Square(int a,int b,int c,int d,int e,int f,int g,int h)
{
setCoordinate(a,b,c,d,e,f,g,h);
}
int area()
{
int d=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
return d*d;
}
}

public class Rectangle extends Quadrilateral
{
Rectangle(int a,int b,int c,int d,int e,int f,int g,int h)
{
setCoordinate(a,b,c,d,e,f,g,h);
}
int area()
{
int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
int d2=(int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
return d1*d2;
}
}

softetechnologies
public class Trapezoid extends Quadrilateral
{
private int height;
Trapezoid(int a,int b,int c,int d,int e,int f,int g,int h,int height)
{
setCoordinate(a,b,c,d,e,f,g,h);
this.height=height;
}
int area()
{
int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
int d2=(int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
return (int)((d1+d2)*height)/2;
}
}

public class Parallelogram extends Quadrilateral
{
private int height;
Parallelogram(int a,int b,int c,int d,int e,int f,int g,int h,int height)
{
setCoordinate(a,b,c,d,e,f,g,h);
this.height=height;
}
int area()
{
int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
return d1*height;
}
}

public class TestQuadrilateral
{
public static void main(String []args)
{
Square sq=new Square(10,10,20,10,20,20,10,20);
System.out.println("Area Of The Square is " + sq.area());
Rectangle rec=new Rectangle(10,10,30,10,30,20,10,20);
System.out.println("Area Of The Rectangle is " + rec.area());
Parallelogram p=new Parallelogram(10,10,30,10,20,20,0,20,8);
System.out.println("Area Of The Parallelogram is " + p.area());
Trapezoid t=new Trapezoid(10,10,30,10,40,20,0,20,8);
System.out.println("Area Of The Trapezoid is " + t.area());
}
}

 {
    
}
