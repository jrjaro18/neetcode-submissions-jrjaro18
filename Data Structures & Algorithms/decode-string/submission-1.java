class Solution {
    public String decodeString(String s) {
        var stack = new Stack<String>();
        for (var ch : s.split("")) {
            if (ch.equals("]")) {
                var temp = new StringBuilder();
                while (!stack.peek().equals("[")) {
                    temp.insert(0, stack.pop());
                }
                stack.pop();
                var mul = "";
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    mul = stack.pop() + mul;
                }
                var mulInt = Integer.parseInt(mul);
                var pusher = new StringBuilder();
                for (int i = 0; i < mulInt; i++) {
                    pusher.append(temp);
                }
                stack.push(pusher.toString());
            } else {
                stack.push(ch);
            }
        }
        var sol = new StringBuilder();
        while(!stack.isEmpty()) {
            sol.insert(0, stack.pop());
        }
        return sol.toString();
    }
}
