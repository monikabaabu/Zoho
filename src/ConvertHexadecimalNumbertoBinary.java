//Given a Hexadecimal number as an input,
// the task is to convert that number to a Binary number.
//        Examples:
//
//        Input: Hexadecimal = 1AC5
//        Output: Binary = 0001101011000101
//        Explanation:
//        Equivalent binary value of 1: 0001
//        Equivalent binary value of A: 1010
//        Equivalent binary value of C: 1100
//        Equivalent binary value of 5: 0101
//
//        Input: Hexadecimal = 5D1F
//        Output: Binary = 0101110100011111
// Link:https://www.geeksforgeeks.org/dsa/program-to-convert-hexadecimal-number-to-binary/

import java.util.*;
public class ConvertHexadecimalNumbertoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        String[] map = {
                "0000", //0
                "0001", //1
                "0010", //2
                "0011", //3
                "0100", //4
                "0101", //5
                "0110", //6
                "0111", //7
                "1000", //8
                "1001", //9
                "1010", //10-A
                "1011", //11-B
                "1100", //12-C
                "1101", //13-D
                "1110", //14-E
                "1111", //15-F
//                hexadecimal is 0123456789ABCDEF
        };
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c-'0'>=0 && c-'0' <=9){
                sb.append(map[c-'0']);
            }
            else{
                sb.append(map[c-'A'+10]);
            }
        }
        System.out.println(sb.toString());
    }
}
