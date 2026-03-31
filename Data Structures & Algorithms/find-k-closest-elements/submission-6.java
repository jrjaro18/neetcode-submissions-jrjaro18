class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        var ans = new ArrayList<Integer>();
        var left = 0;
        for (var right = 0; right < arr.length; right++) {
            if (ans.size() >= k) {
                if (Math.abs(arr[left] - x) < Math.abs(arr[right] - x)) {
                    return ans;
                } else if (Math.abs(arr[left] - x) == Math.abs(arr[right] - x)) {
                    if (arr[left] < arr[right]) {
                        return ans;
                    } else {
                        ans.remove(0);
                        left++;
                    }
                } else {
                    ans.remove(0);
                    left++;
                }
            }
            ans.add(arr[right]);
        }
        return ans;
    }
}