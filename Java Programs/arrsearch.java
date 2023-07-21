import java.util.*;
public class arrsearch {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int i,index=0,flag=0;
    for(i=0;i<n;i++)
    {
        arr[i]=obj.nextInt();
    }
        
        int key=obj.nextInt();
        for(i=0;i<n-1;i++)
        {
            if(key==arr[i])
            {
               index=i;
               flag=1;
            }
        }
        if(flag==1)
        {
             System.out.println("the element is found at position " + index);
        }
        else
        System.out.println("Element not found in array");
    }
}

// input
// 5
// 1 2 3 4 5
// 3
// output
// the element is found at position 2