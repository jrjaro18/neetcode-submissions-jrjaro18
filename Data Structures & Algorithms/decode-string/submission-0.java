class Solution {
    public String decodeString(String s) {
        var stack = new Stack<String>();
        for (var ch : s.split("")) {
            if (ch.equals("]")) {
                var temp = "";
                while (!stack.peek().equals("[")) {
                    temp = stack.pop() + temp;
                }
                stack.pop();
                var mul = "";
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    mul = stack.pop() + mul;
                }
                var mulInt = Integer.parseInt(mul);
                var pusher = "";
                for (int i = 0; i < mulInt; i++) {
                    pusher+=temp;
                }
                stack.push(pusher);
            } else {
                stack.push(ch);
            }
        }
        var sol = "";
        while(!stack.isEmpty()) {
            sol = stack.pop() + sol;
        }
        return sol;
    }
}
