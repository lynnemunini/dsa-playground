class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num == 0) {
                list.add(num);
            }
            list.add(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
}