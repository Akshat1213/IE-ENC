import java.util.*;

public class SetMatrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the dimensions of the matrix:");
        int m = obj.nextInt();
        int n = obj.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = obj.nextInt();
            }
        }
        int[][] flagMat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0)
                    flagMat[i][j] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flagMat[i][j] == 1) {
                    for (int k = 0; k < m; k++) {
                        matrix[k][j] = 0;
                    }
                    for (int k = 0; k < n; k++) {
                        matrix[i][k] = 0;
                    }
                }
            }
        }
        System.out.println("After setting zeros:");
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        obj.close();
    }
}