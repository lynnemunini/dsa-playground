class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String iStr = String.valueOf(i);
            boolean selfDividing = false;
            for (int k = 0; k < iStr.length(); k++) {
                if (Character.getNumericValue(iStr.charAt(k)) == 0) {
                    selfDividing = false;
                    break;
                }
                else {
                    selfDividing = (i % Character.getNumericValue(iStr.charAt(k))) == 0;
                    if (!selfDividing) break;
                }
            }
            if (selfDividing) {
                result.add(i);
            }
        }
        return result;
    }
}