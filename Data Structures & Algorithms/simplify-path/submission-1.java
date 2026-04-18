class Solution {

    public String simplifyPath(String path) {
        var stack = new Stack<String>();
        var idx = 0;
        while (idx < path.length()) {
            var ch = path.charAt(idx);
            if (isASlash(ch)) idx++;

            else if(isAPeriod(ch)) {
                var strBuilder = new StringBuilder();
                var noOfPeriods = 0;
                while(idx < path.length() && !isASlash(path.charAt(idx))) {
                    if(isAPeriod(path.charAt(idx))) noOfPeriods++;
                    strBuilder.append(path.charAt(idx++));
                }
                if(strBuilder.length() != noOfPeriods) {
                    stack.push(strBuilder.toString());
                }
                else if(strBuilder.length() > 2) {
                    stack.push(strBuilder.toString());
                }
                else if(strBuilder.length() == 2 && !stack.isEmpty()) {
                    stack.pop();
                }
            } 

            else {
                var strBuilder = new StringBuilder();
                while(idx < path.length() && !isASlash(path.charAt(idx))) {
                    strBuilder.append(path.charAt(idx++));
                }
                stack.push(strBuilder.toString());
            }
        }
        var strBuilder = new StringBuilder();
        while(!stack.isEmpty()) {
            strBuilder.insert(0, "/"+stack.pop());
        }
        return strBuilder.length() == 0 ? "/" : strBuilder.toString();
    }

    private boolean isAUnixSymbol(char s) {
        return isAPeriod(s) || isASlash(s);
    }

    private boolean isAPeriod(char s) {
        return s=='.';
    }

    private boolean isASlash(char s) {
        return s=='/';
    }

}