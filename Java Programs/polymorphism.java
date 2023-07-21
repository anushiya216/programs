public class polymorphism {
    public static int trap(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;
        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    result += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    result += rightMax - arr[right];
                }
                right--;
            }
        }
    }
    return result;
}

public static void main(String[] args) {
    int[] arr1 = {2, 0, 2};
    int[] arr2 = {3, 0, 2, 0, 4};
    System.out.println(trap(arr1)); 
    System.out.println(trap(arr2));
}