//Link : https://www.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency/0
import java.util.*;
public class SortingElementsofanArraybyFrequency {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }

            Integer[] nums = new Integer[arr.length];
            for (int i = 0; i < nums.length; i++) {
                nums[i]=arr[i] ;
            }
            Arrays.sort(nums,(a,b) ->{
                if(map.get(a)!=map.get(b)){
                    return map.get(b)-map.get(a);
                }
                return a-b;
            } );

            for (int i = 0; i < nums.length-1; i++) {
                System.out.print(nums[i]+" ");
            }
            System.out.print(nums[nums.length-1]);
            System.out.println();
        }

    }
}
