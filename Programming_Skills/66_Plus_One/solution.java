class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int last_index = digits.length - 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = (digits[i] + 1) % 10;
                return digits;
            } else if (i == 0) {
                int[] tempArr = new int[digits.length + 1];
                tempArr[0] = 1;
                for (int j = 1; j < tempArr.length; j++) {
                    tempArr[j] = 0;
                }
                return tempArr;
            } else {
                digits[i] = (digits[i] + 1) % 10;
            }
        }
        return digits;
    }
}