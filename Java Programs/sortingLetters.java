import java.util.*;
public class sortingLetters 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    
}
