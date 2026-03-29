class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int max = 0;
        while (left < right) {
            int localMax = Math.min(heights[left], heights[right]) * (right - left);
            max = Math.max(max, localMax);
            if (heights[left] < heights[right]) left++;
            else right--;
        }
        return max;
    }
}
