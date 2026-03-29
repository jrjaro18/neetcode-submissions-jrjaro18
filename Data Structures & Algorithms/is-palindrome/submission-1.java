class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        String sn = s.toLowerCase();

        while(i < j) {
            if ((sn.charAt(i) < 'a' || sn.charAt(i) > 'z') && !(sn.charAt(i) >= '0' && sn.charAt(i) <= '9')) {
                i++;
                continue;
            }
            if ((sn.charAt(j) < 'a' || sn.charAt(j) > 'z') && !(sn.charAt(j) >= '0' && sn.charAt(j) <= '9')) {
                j--;
                continue;
            }
            if (sn.charAt(i++) != sn.charAt(j--)) return false;
        }
        return true;
    }
}
