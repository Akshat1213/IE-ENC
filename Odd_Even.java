import java.util.*;
class Odd_Even_class{
    int n;
    Odd_Even_class(int num){
        n  = num;
    }
    void oddOrEven(){
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
public class Odd_Even {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = obj.nextInt();
        Odd_even_class oec = new Odd_Even_class(n);
        oec.oddOrEven();
    }
}