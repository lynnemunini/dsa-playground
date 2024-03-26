class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int num : nums1) {
            if (!list1.contains(num)) list1.add(num);
        }

        for (int num : nums2) {
            if (!list2.contains(num)) list2.add(num);
        }

        for (Integer integer : list1) {
            if (!result.contains(integer)) {
                if (list2.contains(integer)) {
                    result.add(integer);
                }
            }
        }

        int[] resultArray = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}