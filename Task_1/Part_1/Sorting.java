import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = obj.nextInt();
        System.out.println("Enter elements: ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = obj.nextInt();
        }
        int low = 0, mid = 0;
        int high = n - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        System.out.println("Sorted array: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        obj.close();
    }
}
