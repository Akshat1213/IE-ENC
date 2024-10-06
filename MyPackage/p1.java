package MyPackage;

public class p1 {
    int n;
    public p1(int num){
        n  = num;
    }
    public void oddOrEven() throws OddException,EvenException{
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