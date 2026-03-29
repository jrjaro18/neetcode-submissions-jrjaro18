class Solution {
    public boolean hasDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        for (var x : nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}