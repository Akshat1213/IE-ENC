import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of elments: ");
        int n = obj.nextInt();
        System.out.println("Enter elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]){
                System.out.println("Duplicate:"+arr[i]);
                break;
            }
        }
        obj.close();
    }
}
