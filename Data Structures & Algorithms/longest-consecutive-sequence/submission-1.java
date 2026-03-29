class Solution {
    public int longestConsecutive(int[] nums) {
        var set = new HashSet<Integer>();
        for (var num : nums) set.add(num);
        var maxima = 0;
        
        for (var num : nums) {
            var curr = num;
            var localMaxima = 0;
            if (set.contains(curr-1)) continue;
            while (set.contains(curr)) {
                localMaxima++;
                maxima = Math.max(maxima, localMaxima);
                curr++;
            }
        }

        return maxima;
    }
}