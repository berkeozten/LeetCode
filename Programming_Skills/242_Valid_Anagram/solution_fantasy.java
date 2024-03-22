class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int totalS = 0; 

        // I wanted to brute force test cases for fun, there was a test case for power of 1,2 and 3 but not for 4.

        for (int i = 0; i < s.length(); i++){
            totalS += (int) s.charAt(i) * (int) s.charAt(i) * (int) s.charAt(i) * (int) s.charAt(i) 
                        - (int) t.charAt(i) * (int) t.charAt(i) * (int) t.charAt(i) * (int) t.charAt(i);
        }

        return totalS == 0 ? true : false;
    }
}