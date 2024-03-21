class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] charArr = new int[26];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = 0;
        }
        for (int i = 0; i < s.length(); i++){
            charArr[(int) s.charAt(i) - 'a'] ++;
            charArr[(int) t.charAt(i) - 'a'] --;
        }
        for (int val : charArr){
            if(val != 0){
                return false;
            }
        }
        
        return true;

        // 1ms faster but needs 1.7 mb more memory
        
        // char[] sChars = s.toCharArray();
        // char[] tChars = t.toCharArray();
        // Arrays.sort(sChars);
        // Arrays.sort(tChars);

        // return Arrays.equals(sChars, tChars);
    }
}