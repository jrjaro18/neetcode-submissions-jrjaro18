class Solution {
    public int evalRPN(String[] tokens) {
        var stack = new Stack<Integer>();
        for (var token : tokens) {
            if (!isAOperator(token)) stack.push(Integer.parseInt(token));
            else {
                var num1 = stack.pop();
                var num2 = stack.pop();
                var num3 = switch (token) {
                    case "+" -> num2+num1;
                    case "-" -> num2-num1;
                    case "*" -> num2*num1;
                    case "/" -> num2/num1;
                    default -> 0;
                };
                stack.push(num3);
            }
        }
        return stack.pop();
    }
    private boolean isAOperator(String token) {
        return switch(token) {
            case "+" -> true;
            case "-" -> true;
            case "/" -> true;
            case "*" -> true;
            default -> false;
        };
    }
}
