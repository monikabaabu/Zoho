//link : https://www.geeksforgeeks.org/problems/check-for-subsequence4930/1
import java.util.*;
public class Checkforsubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(isSubSequence(A,B));
    }
    private static boolean isSubSequence(String A, String B) {
            if(A.length()>B.length()){
                return false;
            }
            int l=0;
            int i=0;
            while(l<B.length()){
                if(i==A.length()){
                    return true;
                }
                if(A.charAt(i)==B.charAt(l)){
                    i++;
                    l++;
                }
                else{
                    l++;
                }
            }
            return i==A.length();
        }
    }

