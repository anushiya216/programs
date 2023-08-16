import java.util.*;
public class CountOfProductID {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        char arr[]=new char[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.next().charAt(0);
            if(arr[i]!='A' && arr[i]!='E' && arr[i]!='I' && arr[i]!='O' && arr[i]!='U' && arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u')
            {
                count++;
            }
        }
        System.out.println(count);
    }    
}
