class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s.substring(left, right))
                || isPalindrome(s.substring(left+1, right+1));
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}