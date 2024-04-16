class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        List<Character> list = new ArrayList<>();

        for (char c: letters) {
            if (!list.contains(c)) list.add(c);
        }

        if (!list.contains(target)) list.add(target);
        Collections.sort(list);

        if (list.getLast() != target) {
            return list.get(list.indexOf(target) + 1);
        }

        return list.getFirst();
    }
}