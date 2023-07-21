class Gfather{
    String G_name="kavin";
    int G_age=76;
    int G_salary=80000;
}
class mother01 extends Gfather {
   String M01_name="Swathi";
    int M01_age=46;
    int M01_salary=50000;
}
class son01 extends mother01{
   String S01_name="Kumar";
   int S01_age=19;
   int Sch_fee=11500;
}
class father01 extends mother01{
   String F01_name="Sarjin";
    int F01_age=50;
    int F01_salary=95000;
}
class father02 extends Gfather{
   String F02_name="Dolto";
    int F02_age=52;
    int F02_salary=100000;
}
class daughter extends father02{
    String D_name="Saranya";
    int D_age=20;
    int Sch_fee=18500;
}
class son02 extends father02{
     String S02_name="Ram";
    int S02_age=17;
    int Sch_fee=17500;
}
class mother02 extends father02{
   String M02_name="Sharu";
    int M02_age=41;
    int M02_salary=20000;
}
public class grandpainheritance{
public static void main(String[] args){
   son01 s=new son01(); 
   daughter d=new daughter();
   son02 s2=new son02(); 
   System.out.println("Name \t Age \t Salary \t");
   System.out.println(s.G_name+"\t "+s.G_age+"\t "+s.G_salary+"\n");
   System.out.println(s.M01_name+"\t "+s.M01_age+"\t "+s.M01_salary+"\n");
   System.out.println(s2.F02_name+"\t "+s2.F02_age+"\t "+s2.F02_salary+"\n");
   System.out.println("\n"+"Sch_fee of their GrandSon:");
   System.out.println(s2.S02_name+"-"+s2.Sch_fee);
   System.out.println(s.S01_name+"-"+s.Sch_fee);
   System.out.println(d.D_name+"-"+d.Sch_fee);
}
}