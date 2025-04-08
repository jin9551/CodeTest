class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = Stream.concat(Arrays.stream(nums1).boxed(), Arrays.stream(nums2).boxed())
                           .collect(Collectors.toList());
        Collections.sort(list);

        int n = list.size();
        if(n%2==0){
            return ((double)list.get(n/2) + (double)list.get(n/2-1)) / 2;
        } else {
            return (double)list.get(n/2);
        }
    }
}