class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();

        var canConstruct = false;

        for (int i = 0; i < ransomNote.length(); i++) {
            if (ransomNoteMap.containsKey(ransomNote.charAt(i))) {
                ransomNoteMap.replace(ransomNote.charAt(i), ransomNoteMap.get(ransomNote.charAt(i)) + 1);
            } else ransomNoteMap.put(ransomNote.charAt(i), 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            if (magazineMap.containsKey(magazine.charAt(i))) {
                magazineMap.replace(magazine.charAt(i), magazineMap.get(magazine.charAt(i)) + 1);
            } else magazineMap.put(magazine.charAt(i), 1);
        }

        for (Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet()) {
            if (magazineMap.containsKey(entry.getKey()) && magazineMap.get(entry.getKey()) >= entry.getValue()) {
                canConstruct = true;
            } else {
                canConstruct = false;
                break;
            }
        }
        return canConstruct;
    }
}