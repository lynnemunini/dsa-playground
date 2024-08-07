class Solution {
     public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int min = 0;

        if (arr.length > 1) {
            min = Math.abs(arr[1] - arr[0]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr.length) {
                if (Math.abs(arr[i + 1] - arr[i]) < min) {
                    min = Math.abs(arr[i + 1] - arr[i]);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr.length) {
                if (Math.abs(arr[i + 1] - arr[i]) == min) {
                    List<Integer> valid = new ArrayList<>();
                    valid.add(arr[i]);
                    valid.add(arr[i + 1]);
                    list.add(valid);
                }
            }
        }

        return list;
    }
}