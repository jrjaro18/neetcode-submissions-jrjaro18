class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int localMin = heights[i];
            for (int j = i; j < heights.length; j++) {
                if (heights[j]==0) break;
                localMin = Math.min(localMin, heights[j]);
                max = Math.max(max, localMin*(j-i+1));
            }
        }
        return max;
    }
}