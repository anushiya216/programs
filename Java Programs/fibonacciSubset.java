import java.util.*;
public class fibonacciSubset
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        ArrayList <Integer> arr=new ArrayList<Integer>();
        int b=0,a=0;
        ArrayList <Integer> input=new ArrayList<>();
        do{
            a=obj.nextInt();
            input.add(b++,a);
        }while(a>=0);
        arr.add(0,0);
        arr.add(1,1);
        int c=2;
        for(int i=0;i<10;i++)
        {
            arr.add(c,(arr.get(c-1)+arr.get(c-2)));
            c++;
        }
        for(int i=0;i<input.size();i++)
        {
            for(int j=0;j<arr.size();j++)
            {
                if(input.get(i).equals(arr.get(j)))
                {
                    System.out.print(input.get(i)+" ");
                    break;
                }
            }
        }
    }
}