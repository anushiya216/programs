import java.util.Scanner;

public class adpropel2  
{
	public static int longestSubstringWithKUniqueCharacters(String s, int k) 
    {
	    int n = s.length();
		int answer = -1;
		for(int i = 0; i < n; i++) 
        {
			for(int j = i + 1; j <= n; j++) 
            {
				int distinct = 0;
				int count[] = new int[26];
				for(int l = i; l < j; l++) {
					count[s.charAt(l) - 'a']++;
				}
				for(int l = 0; l < 26; l++) {
					distinct += (count[l] > 0 ? 1 : 0);
				}
				if(distinct == k) {
					answer = Math.max(answer, j - i);
				}
			}
		}
		return answer;
	}
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int k=obj.nextInt();
        //s.charAt(0)-'0';
        System.out.println(longestSubstringWithKUniqueCharacters(s,k));
        
    }
}