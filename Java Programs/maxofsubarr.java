public class maxofsubarr 
{
        static void printKMax(int arr[], int N, int K)
        {
            int i,j, max;
          
            for (i = 0; i <= N - K; i++) 
            {
                max = arr[i];
          
                for (j = 1; j < K; j++) 
                {
                    if (arr[i + j] > max)
                        max = arr[i + j];
                }
                System.out.print(max + " ");
            }
        }
        public static void main(String args[])
        {
            int arr[] = { 1, 2, 3, 1,4, 5, 2,3,6 };
            int K = 3;
                
            printKMax(arr, arr.length, K);
        }
    }
    
    // input
    // 1, 2, 3, 1, 4, 5, 2, 3, 6
    // K = 3
    // output
    // 3 3 4 5 5 5 6 

