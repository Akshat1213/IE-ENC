import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        List<List<Integer>> tri = new ArrayList<>();
        System.out.println("Enter the number of rows: ");
        int rows = obj.nextInt();
        for(int i = 0;i<rows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    row.add(tri.get(i-1).get(j-1)+tri.get(i-1).get(j));
                }
            }
            tri.add(row);
        }
        for(List<Integer> row : tri){
            for(Integer ele : row){
                System.out.print(ele+"\t");
            }
            System.out.println();
        }
    }
}