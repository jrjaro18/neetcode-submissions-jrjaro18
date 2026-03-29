class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length-1;
        int trips = 0;

        while (left<right) {
            if (people[right] + people[left] <= limit) left++;
            right--;
            trips++;
        }

        return left == right ? trips + 1 : trips;
    }
}