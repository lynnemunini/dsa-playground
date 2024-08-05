class Solution {
    public int maxNumberOfBalloons(String text) {
        int count = 0;
        String balloon = "balloon";
        List<Character> list = new ArrayList<>();
        for (char c : text.toCharArray()) {
            list.add(c);
        }

        while (list.size() >= balloon.length()) {
            boolean valid = false;
            for (int i = 0; i < balloon.length(); i++) {
                if (list.contains(balloon.charAt(i))) {
                    int index = list.indexOf(balloon.charAt(i));
                    list.remove(index);
                    valid = true;
                } else {
                    valid = false;
                    break;
                }
            }
            if (valid) count++;
            else break;
        }
        return count;
    }
}