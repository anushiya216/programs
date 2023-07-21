import java.util.*;
class parent
{
    void ride()
    {
        System.out.println("S");

    }
}
public class override extends parent
{
        void ride()
        {
            super.ride();
            System.out.println("A");
            
        }
        
    public static void main(String[] args) 
    {
        override o=new override();
        o.ride();
    }
}
