class Solution {
    public String mergeAlternately(String word1, String word2) {
        int idx1 = 0, idx2 = 0;
        int word1Length = word1.length(), word2Length = word2.length();
        StringBuilder sb = new StringBuilder();
        while (idx1 < word1Length && idx2 < word2Length) {
            sb.append(word1.charAt(idx1++));
            sb.append(word2.charAt(idx2++));
        }
        while (idx1 < word1Length) {
            sb.append(word1.charAt(idx1++));
        }
        while (idx2 < word2Length) {
            sb.append(word2.charAt(idx2++));
        }
        return sb.toString();
    }
}