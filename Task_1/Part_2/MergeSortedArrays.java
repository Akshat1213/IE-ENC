import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length of array 1: ");
        int n = obj.nextInt();
        System.out.println("Enter elements: ");
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = obj.nextInt();
        System.out.println("Enter length of array 2: ");
        int m = obj.nextInt();
        System.out.println("Enter elements: ");
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++)
            arr2[i] = obj.nextInt();

        int arr3[] = new int[n+m]; 
        int i = 0,j = 0,k = 0;
        while(i < n && j < m){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else if(arr1[i]>arr2[j]){
                arr3[k++] = arr2[j++];
            }
            else {
                arr3[k++] = arr1[i++];
                arr3[k++] = arr2[j++];
            }
        }
        while(i < n){
            arr3[k++] = arr1[i++];
        }
        while(j < m){
            arr3[k++] = arr2[j++];
        }
        for(int ele:arr3)
            System.out.print(ele+" ");
        obj.close();
    }
}