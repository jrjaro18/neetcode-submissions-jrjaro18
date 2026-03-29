class Solution {
    public int removeDuplicates(int[] nums) {
        int uniques = 0;
        int changeIdx = 0;
        int idx = 0;
        int lastNo = -101;

        while (idx < nums.length) {
            if (lastNo != nums[idx]) {
                lastNo = nums[idx];
                nums[changeIdx] = nums[idx];
                uniques++;
                changeIdx++;
                idx++;
            } else {
                idx++;
            }
        }

        return uniques;
    }
}