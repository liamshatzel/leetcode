//cyclical numbers must start over at zero if > 9
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] nine = new int[digits.length + 1];
        nine[0] = 1;
        return nine;
    }
}
