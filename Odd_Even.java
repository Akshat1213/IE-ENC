import java.util.*;
import MyPackage.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = obj.nextInt();
        p1 oec = new p1(n);
        try{
            oec.oddOrEven();
        }catch(OddException e){
            System.out.println(e.getMessage());
        }catch(EvenException e){
            System.out.println(e.getMessage());
        }
    }
}