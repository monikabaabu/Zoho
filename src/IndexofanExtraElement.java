
//Link:https://www.geeksforgeeks.org/problems/index-of-an-extra-element/1
import java.util.*;
public class IndexofanExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i <n ; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i <m ; i++) {
            arr2[i] = sc.nextInt();
        }
        int l =0;
        int r = arr2.length-1;

        while (l<=r){
            int mid = l +(r-l)/2;
            if(arr1[mid]==arr2[mid]){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        System.out.println(l);
    }
}
