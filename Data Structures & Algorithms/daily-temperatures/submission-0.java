class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        var stack = new Stack<Integer>();
        var sol = new int[temperatures.length];
        for (var i = 0; i < temperatures.length; i++) {
            if(stack.isEmpty() || temperatures[stack.peek()] >= temperatures[i]) stack.push(i);
            else {
                while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                    var curr = stack.pop();
                    sol[curr] = i - curr;
                }
                stack.push(i);
            }
        }
        return sol;
    }
}
