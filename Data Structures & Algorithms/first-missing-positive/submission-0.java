class Solution {
    public int firstMissingPositive(int[] nums) {
        int min = 1;
        int i = 0;
       while(i < nums.length) {
            if (nums[i] < 1 || nums[i] > nums.length) {
                i++;
                continue;
            }
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else {
                i++;
            }
        }
        for (int num : nums) {
            if (num != min) return min;
            min++;
        }
        return min;
    }
}

// 0, 1, -1
// 1, 2, 4, 4, 5, 6