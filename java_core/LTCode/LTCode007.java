import java.util.Arrays;

class Solution7 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            else {
                digits[i]++;
                return digits;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
        }
    }
class LTCode007 {
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {9, 9, 9}; 

        System.out.println(Arrays.toString(solution.plusOne(digits1)));
        System.out.println(Arrays.toString(solution.plusOne(digits2)));
       
    }
}
