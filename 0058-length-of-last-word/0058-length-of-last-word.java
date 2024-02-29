class Solution {
    public int lengthOfLastWord(String s) {
        String[] myStringArray = s.split(" ");
        return myStringArray[myStringArray.length - 1].length();
    }
}