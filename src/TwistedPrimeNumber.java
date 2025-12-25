//link :https://www.geeksforgeeks.org/problems/twisted-prime-number0500/1
import java.util.*;
public class TwistedPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n));
    }
    private static boolean prime(int n){
        if (n == 0 || n==1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n%2==0) {
            return false;
        }
        for (int i = 3; i <n ; i++) {
            if(n%i==0 && n!=i){
                return false;
            }
        }
        return true;
    }
    private static int isprime(int n){
        if(!prime(n)){
            return 0;
        }
        int x =0;
        int temp =n;
        while (temp>0){
            x = (x*10) + (temp%10);
            temp/=10;
        }
        if(prime(x)){
            return 1;
        }
        return  0;
    }
}
