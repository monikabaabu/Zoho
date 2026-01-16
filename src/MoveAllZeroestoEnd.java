//Link:https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
import java.util.*;
public class MoveAllZeroestoEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int idx =0;
        for (int i = 0; i <n ; i++) {
            if (arr[i]!=0){
                arr[idx] = arr[i];
                idx++;
            }
        }
        while (idx<arr.length){
            arr[idx]=0;
            idx++;
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
