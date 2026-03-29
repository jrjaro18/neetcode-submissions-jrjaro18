class Solution {
    public boolean isValid(String str) {
        var stack = new Stack<Character>();
        for(var symbol : str.toCharArray()) {
            if (isOpenParantheses(symbol)) stack.push(symbol);
            else if (stack.isEmpty() || !stack.pop().equals(getCorrespondingOpenParantheses(symbol))) return false;
        }
        return stack.isEmpty();
    }

    private boolean isOpenParantheses(Character ch) {
        return ch=='(' || ch=='[' || ch=='{';
    }

    private Character getCorrespondingOpenParantheses(Character ch) {
        if (ch==')') {
            return '(';
        } else if(ch==']') {
            return '[';
        } else {
            return '{';
        }
    }
}
