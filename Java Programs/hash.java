import java.util.*;
        interface input
        {
            void in();
        }
                class prints implements input
                {
                    public void in()
                    {
                        Scanner obj=new Scanner(System.in);
                        String s=obj.nextLine();
                        char arr[]=s.toCharArray();
                            for(int i=0;i<s.length();i++)
                            {
                                if(arr[i]=='#')
                                {
                                    System.out.print("#");
                                }
                            }
                            for(int i=0;i<s.length();i++)
                            {
                                if(arr[i]!='#')
                                {
                                    System.out.print(arr[i]);
                                }
                            }
                        }
                    }
            public class hash
            {
                public static void main(String[] args) {
                    prints p=new prints();
                    p.in();
                }
            }