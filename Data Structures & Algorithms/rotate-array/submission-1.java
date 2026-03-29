class Solution {
    public void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k % nums.length - 1);
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