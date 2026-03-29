class Solution {
    public int calPoints(String[] operations) {
        var stack = new Stack<Integer>();
        for (var x : operations) {
            if(x.equals("C")) {
                stack.pop();
            } else if(x.equals("D")) {
                var a = stack.pop();
                stack.push(a);
                stack.push(2*a);
            } else if(x.equals("+")) {
                var a = stack.pop();
                var b = stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a+b);
            } else {
                stack.push(Integer.parseInt(x));
            }
        }
        var total = 0;
        while (!stack.isEmpty()) {
            total+=stack.pop();
        }
        return total;
    }
}