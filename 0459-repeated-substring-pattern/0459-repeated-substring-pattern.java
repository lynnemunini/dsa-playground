class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        for (int i = 1; i <= n / 2; i++) {
            
            if (n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder sb = new StringBuilder();

                sb.append(substring.repeat(n / i));
                
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}