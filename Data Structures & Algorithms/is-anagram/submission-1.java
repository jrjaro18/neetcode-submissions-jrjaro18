class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        var map = new HashMap<Character, Integer>();
        for (char x : s.toCharArray()) map.put(x, map.getOrDefault(x, 0)+1);
        for (char x : t.toCharArray()) {
            if (!map.containsKey(x)) return false;
            int letterCount = map.get(x);
            if (letterCount == 1) map.remove(x);
            else map.put(x, letterCount-1);
        }
        return map.isEmpty();
    }
}
