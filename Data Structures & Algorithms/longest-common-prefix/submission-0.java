class Solution {
    public String longestCommonPrefix(String[] strs) {
        var longestYet = strs[0];
        for (var str : strs) {
            var longestInHere = "";
            for (int i = 0; i < Math.min(longestYet.length(), str.length()); i++) {
                if (str.charAt(i) == longestYet.charAt(i)) longestInHere+=str.charAt(i);
                else break;
            }
            longestYet = longestInHere;
            if (longestYet.equals("")) return longestYet;
        }
        return longestYet;
    }
}