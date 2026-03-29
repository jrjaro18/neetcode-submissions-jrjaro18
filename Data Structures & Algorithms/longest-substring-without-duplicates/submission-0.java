class Solution {
    public int lengthOfLongestSubstring(String s) {
        var max = 0;
        var left = 0;
        var right = 0;
        var set = new HashSet<Character>();

        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                while(set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
            } else {
                max = Math.max(max, right - left + 1);
                set.add(s.charAt(right));
                right++;
            }
        }

        return max;
    }
}
