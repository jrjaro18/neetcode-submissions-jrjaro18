class Solution {
    public int search(int[] nums, int k) {
        int left = 0, right = nums.length-1;
        while(left <= right) {
            int midpoint = left + ((right-left)/2);
            if (k == nums[midpoint]) return midpoint;
            else if (k < nums[midpoint]) right = midpoint-1;
            else left = midpoint+1;
        }
        return -1;
    }
}
