class Solution {
    public int characterReplacement(String s, int k) {
        var count = new HashMap<Character, Integer>();
        int left = 0, right = 0;
        int max = 0, res = 0;
        while(right < s.length()) {
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0) + 1);
            max = Math.max(max, count.get(s.charAt(right)));
            while ((right - left + 1) - max > k) {
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
