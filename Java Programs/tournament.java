import java.util.*;
public class tournament 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int M1=obj.nextInt();
        int M2=obj.nextInt();
        int R1=obj.nextInt();
        int M1_M2=obj.nextInt();
        int M1_R1=obj.nextInt();
        int R1_M2=obj.nextInt();
        int M1_M2_R1=obj.nextInt();
        System.out.print(R1-((M1_R1-M1_M2_R1)+(R1_M2-M1_M2_R1)+(M1_M2_R1))+" ");
        System.out.println(M1_M2-M1_M2_R1);
    }   
}