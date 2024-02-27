class Solution {
    public int romanToInt(String s) {
        int index = s.length() - 1;
        int[] digits = new int[s.length()];

        HashMap<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        while (index >= 0) {
            char symbol = s.charAt(index);

            if (index > 0 && symbols.get(s.charAt(index - 1)) < symbols.get(symbol)) {
                digits[index] = symbols.get(symbol) - symbols.get(s.charAt(index - 1));
                index -= 2;
            } else if (index > 0 && symbols.get(s.charAt(index - 1)) >= symbols.get(symbol)) {
                digits[index] = symbols.get(symbol);
                index -= 1;
            } else if (index == 0) {
                digits[index] = symbols.get(symbol);
                break;
            }
        }

        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }
}