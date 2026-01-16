//Link:https://www.geeksforgeeks.org/dsa/program-to-find-prime-numbers-between-given-interval/
import java.util.*;
public class FindPrimeNumbersBetweengivenInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m<1){
            m=1;
        }
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i*i <=n; i++) {
            if (prime[i]){
                for (int j = i*i; j <=n ; j+=i) {
                    prime[j]=false;
                }
            }
        }
        for (int i = m; i <n ; i++) {
            if (prime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
