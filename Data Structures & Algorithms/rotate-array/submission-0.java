class Solution {
    public void rotate(int[] nums, int k) {
        // for (var i = 0; i < nums.length / 2; i++) {
        //     var temp = nums[i];
        //     nums[i] = nums[nums.length - i - 1];
        //     nums[nums.length - i - 1] = temp;
        // } 
        reverse(nums, 0, nums.length - 1);
        // for (var i = 0; i < k % nums.length; i++) {
        //     var temp = nums[i];
        //     nums[i] = nums[k % nums.length - i - 1];
        //     nums[nums.length - i - 1] = temp;
        // }
        reverse(nums, 0, k % nums.length - 1);
        // for (var i = k % nums.length; i < nums.length; i++) {
        //     var temp = nums[i];
        //     nums[i] = nums[nums.length - i - 1];
        //     nums[nums.length - i - 1] = temp;
        // }
        reverse(nums, k % nums.length, nums.length - 1);
    }
    private void reverse(int[] nums, int left, int right) {
        int length = right - left + 1;
        for (var i = 0; i < length / 2; i++) {
            var temp = nums[left + i];
            nums[left + i] = nums[right - i];
            nums[right - i] = temp;
        }
    }
}