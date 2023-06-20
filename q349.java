class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numsSet2 = new HashSet<Integer>();

        for (int i = 0; i < nums2.length; i++) {
            numsSet2.add(nums2[i]);
        }

        List<Integer> inter = new ArrayList<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            if (numsSet2.contains(nums1[i])) {
                inter.add(nums1[i]);
                numsSet2.remove(nums1[i]);
            }
        }

        int[] res = new int[inter.size()];
        for (int i = 0; i < inter.size(); i++) {
            res[i] = inter.get(i);
        }

        return res;
    }
}
