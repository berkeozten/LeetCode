class Solution {
    public boolean repeatedSubstringPattern(String s) {

        // So this is not 100% my answer because I learned the logic behind this from solution section
        // So for a pattern to repeat in a string we can say it is like P+P where p is the patern 
        // which repeated twice to create said string. The trick is if you add itself to it now you have
        // P+P+P+P, If you break patern you get B+P+P+B, Notice how P+P still exist in string. This works for
        // all version of pattern repeation so you can check if broken string still have original string to see
        // if a repeating patern existed in original string.

        String doubled = s + s;
        String subStr = doubled.substring(1, doubled.length() - 1);
        return subStr.contains(s);  
    }
}