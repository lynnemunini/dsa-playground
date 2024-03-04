class Solution {
   public int climbStairs(int n) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n - 1) {
                result = sequence.get(i) + sequence.get(i + 1);
                break;
            } else {
                sequence.add(sequence.get(i) + sequence.get(i + 1));
            }
        }
        return result;
    }
}