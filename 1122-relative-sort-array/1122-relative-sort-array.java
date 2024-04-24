class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        var arr2List = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();

        for (int num: arr2) {
            arr2List.add(num);
            var count = 0;
            for (int j : arr1) {
                if (j == num) count++;
            }

            for (int i = 0; i < count; i++) {
                sortedList.add(num);
            }
        }

        for (int num: arr1) {
            if (!arr2List.contains(num)) sortedList.add(num);
        }

        int[] sortedArray = new int[sortedList.size()];

        for (int i = 0; i < sortedList.size(); i++) {
            sortedArray[i] = sortedList.get(i);
        }

        return sortedArray;
    }
}