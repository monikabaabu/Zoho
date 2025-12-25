import java.util.*;

public class primenumbersfrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] prime = new boolean[n+1];
        for(int i=2;i<n;i++){
            prime[i] = true;

        }
        for (int i = 0; i*i <n ; i++) {
            if(prime[i]){
                for (int j = i*i; j <n ; j+=i) {
                    prime[j]=false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (prime[i]){
                System.out.println(i);
            }
        }
    }


}
