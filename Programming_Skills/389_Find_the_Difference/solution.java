class Solution {
    public char findTheDifference(String s, String t) {
        int lastOrd = 0;
        for (int i = 0; i < s.length(); i++ ){
            lastOrd += (int)t.charAt(i) - (int) s.charAt(i);
        }
        lastOrd += (int) t.charAt(t.length()-1);
        return (char) lastOrd;
    }
}