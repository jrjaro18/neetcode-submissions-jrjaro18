class Solution {
    public int removeDuplicates(int[] nums) {
        int uniques = 1;
        int changeIdx = 1;
        int idx = 1;

        while (idx < nums.length) {
            if (nums[idx-1] != nums[idx]) {
                nums[changeIdx] = nums[idx];
                uniques++;
                changeIdx++;
            }
            idx++;
        }

        return uniques;
    }
}