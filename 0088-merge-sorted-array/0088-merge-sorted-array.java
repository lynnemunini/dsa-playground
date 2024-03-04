class Solution {
     public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            myArrayList.add(nums1[i]);
        }
        for (int i: nums2) {
            myArrayList.add(i);
        }

        for (int i = 0; i < myArrayList.size(); i++) {
            nums1[i] = myArrayList.get(i);
        }
        Arrays.sort(nums1);
    }
}