import java.util.*;
import java.lang.*;
class crab
{
    public static void main(String args[])
    {
        int i,n,fuel,len,m,s=0;
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[10];
        for(i=0;i<10;i++)
        {
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        len=arr.length;
        m=arr[len/2];
        fuel=0;
        for(i=0;i<len;i++)
        {
            s=arr[i]-m;
            fuel+=(Math.abs(s));
        }
        System.out.println(m);
        System.out.println(fuel);
    }
}