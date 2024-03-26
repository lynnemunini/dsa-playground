class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int position = 0;

        if (nums1.length <= nums2.length) {
            for (int k : nums2) {
                for (int j = position; j < nums1.length; j++) {
                    if (k == nums1[j]) {
                        result.add(nums1[j]);
                        position = j+1;
                        break;
                    }
                }
            }
        } else {
            for (int k : nums1) {
                for (int j = position; j < nums2.length; j++) {
                    if (k == nums2[j]) {
                        result.add(nums2[j]);
                        position = j+1;
                        break;
                    }
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