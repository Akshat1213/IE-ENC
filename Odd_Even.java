import java.util.*;
class OddException extends Exception{
    OddException(String m){
        super(m);
    }
}

class EvenException extends Exception{
    EvenException(String m){
        super(m);
    }
}

class Odd_Even_class{
    int n;
    Odd_Even_class(int num){
        n  = num;
    }
    void oddOrEven() throws OddException,EvenException{
        for(int i = 0;i<=n;i++){
                if(2*i == n){
                throw new EvenException("Even");
            }
            if((2*i)+1 == n){
                throw new OddException("Odd");
            }
        }
    }
}
public class Odd_Even {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = obj.nextInt();
        Odd_Even_class oec = new Odd_Even_class(n);
        try{
            oec.oddOrEven();
        }catch(OddException e){
            System.out.println(e.getMessage());
        }catch(EvenException e){
            System.out.println(e.getMessage());
        }
    }
}