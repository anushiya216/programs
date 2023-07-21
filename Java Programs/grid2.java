import java.util.*;
public class grid2{
    public static void main(String[] args) {
        int t=4;
        Scanner sc=new Scanner(System.in);
        while(t-->0){
            int r=sc.nextInt();
            int c=sc.nextInt();
            int a[][]=new int[r+1][c+1];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    a[r][c]=sc.nextInt();
                }
            }
            int max=0,val=20;
            for(int i=0;i<r;i++){
                int sum=0;
                for(int j=0;j<c;j++){
                    sum+=a[i][j];
                }
                if(sum>max){
                    max=sum;val=i;
                }  
                }
                System.out.println(val+1); 
            }
            
        }

    }