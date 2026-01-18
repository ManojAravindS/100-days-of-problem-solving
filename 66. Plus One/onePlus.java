class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i > -1; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits; //Normal adding
            }
            digits[i] = 0;
        }
        int[] number = new int[digits.length + 1]; \\ when the limit is exceeded
        number[0] = 1;
        return number;
    }
}