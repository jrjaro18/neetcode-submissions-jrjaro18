class Solution {
    public int lastStoneWeight(int[] stones) {
        var arena = new PriorityQueue<Integer>((x,y)->y-x);
        for (var stone : stones) arena.offer(stone);
        while (arena.size() != 1) {
            var contestant1 = arena.remove();
            var contestant2 = arena.remove();
            var winner = Math.abs(contestant1 - contestant2);
            arena.offer(winner);
        }
        return arena.remove();
    }
}
