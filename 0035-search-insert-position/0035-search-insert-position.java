class Solution {
     public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i : nums) {
            myList.add(i);
        }

        if (!myList.contains(target)) {
            myList.add(target);
            Collections.sort(myList);
        }
        return myList.indexOf(target);
    }
}