class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if (!isAlphaNumeric(s.charAt(left))) {
                left++;
                continue;
            }
            if (!isAlphaNumeric(s.charAt(right))) {
                right--;
                continue;
            }
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
    private boolean isAlphaNumeric(char c) {
        if (c >= 'a' && c <= 'z') return true;
        if (c >= '0' && c <= '9') return true;
        return false;
    }
}
