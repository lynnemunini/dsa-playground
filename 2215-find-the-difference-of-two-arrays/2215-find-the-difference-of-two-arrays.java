class Solution {
   public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums1) {
            if (!list1.contains(num)) list1.add(num);
        }

        for (int num : nums2) {
            if (!list2.contains(num)) list2.add(num);
        }

        List<Integer> list1Result = new ArrayList<>(list1);
        List<Integer> list2Result = new ArrayList<>(list2);

        for (int num : list1) {
            if (list2.contains(num)) {
                list1Result.remove(list1Result.indexOf(num));
            }
        }

        for (int num : list2) {
            if (list1.contains(num)) {
                list2Result.remove(list2Result.indexOf(num));
            }
        }
        result.add(list1Result);
        result.add(list2Result);

        return result;
    }
}