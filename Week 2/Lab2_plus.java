
import java.util.Arrays;
public class Lab2_plus {
    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++; return digits;
            }
            digits[i] = 0;
        }

        int[] newNum = new int [n+1];
        newNum [0] = 1;
        return newNum;
    }
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        int[]ans=plusOne(arr);
        System.out.println(Arrays.toString(ans));
        
    }
}
