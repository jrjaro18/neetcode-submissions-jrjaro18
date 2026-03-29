class Solution {
    public int majorityElement(int[] nums) {
       int maj = -100;
       int count = 0; 
       for (int num : nums) {
            if(maj == num) count++;
            else {
                if (count == 0) {
                    maj = num;
                    count++;
                }
                else count--;
            }
       }
       return maj;
    }
}