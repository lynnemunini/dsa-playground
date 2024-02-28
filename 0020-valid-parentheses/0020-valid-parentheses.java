class Solution {
 public boolean isValid(String s) {
        HashMap<Character, Character> characterHashMap = new HashMap<>();
        characterHashMap.put('(', ')');
        characterHashMap.put('{', '}');
        characterHashMap.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char myChar = s.charAt(i);
            if (characterHashMap.containsKey(myChar)) {
                stack.push(myChar);
            } else {
                if (stack.empty() || characterHashMap.get(stack.pop()) != myChar) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}