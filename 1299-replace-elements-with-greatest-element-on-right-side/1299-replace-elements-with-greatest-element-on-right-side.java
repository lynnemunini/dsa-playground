class Solution {
    public int[] replaceElements(int[] arr) {
        int position = 1;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            var max = -1;
            for (int j = position; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            result[i] = max;
            position += 1;
        }
        return result;
    }
}