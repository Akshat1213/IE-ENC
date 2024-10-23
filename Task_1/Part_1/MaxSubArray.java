import java.util.*;
public class MaxSubArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = obj.nextInt();
        System.out.println("Enter elements: ");
        int nums[] = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = obj.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (max < sum)
                    max = sum;
            }
        }
        System.out.println("Largest sum:"+max);
        obj.close();
    }
}
