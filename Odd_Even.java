import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = obj.nextInt();
        for(int i = 0;i<=n;i++){
            if(2*i == n){
                System.out.println("Even");
                System.exit(0);
            }
            if((2*i)+1 == n){
                System.out.println("Odd");
                System.exit(0);
            }
        }
    }
}