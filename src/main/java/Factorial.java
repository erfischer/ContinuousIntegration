public class Factorial {
    public static int calculateFactorial(int n){
        if(n == 1){
            return 1;
        }else{
            return calculateFactorial((n-1))*n;
        }
    }
}

