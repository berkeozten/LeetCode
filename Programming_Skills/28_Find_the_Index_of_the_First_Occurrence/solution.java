class Solution {
    public int strStr(String haystack, String needle) {
        int needLen = needle.length();
        if (needLen > haystack.length()){
            return -1;
        }          

        for(int i = 0; i < haystack.length() - needLen + 1; i++){
            if (haystack.substring(i, i + needLen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}