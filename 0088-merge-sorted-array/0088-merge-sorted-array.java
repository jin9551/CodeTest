class Solution {
    static int[] temp;
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length;
        temp = new int[k];

        for(int i=m;i<k;i++){
            nums1[i] = nums2[i-m];
        }

        merge_sort(nums1,0,k-1);
        temp = null;
    }

    public void merge_sort(int[] a, int left, int right){
        if(left == right) return;

        int mid = (left+right)/2;

        merge_sort(a,left,mid);
        merge_sort(a,mid+1,right);
        
        merge(a,left,mid,right);
    }

    public void merge(int[] a, int left, int mid, int right){
        int l = left;
        int r = mid+1;
        int idx = left;

        while(l<=mid && r<=right){
            
            if(a[l] <= a[r]){
                temp[idx] = a[l];
                idx++;
                l++; 
            } else {
                temp[idx] = a[r];
                idx++;
                r++; 
            }
        }

        if(l>mid){
			while(r <= right) {
				temp[idx] = a[r];
				idx++;
				r++;
			}
        } else {
            while(l <= mid) {
				temp[idx] = a[l];
				idx++;
				l++;
			}
        }

        for(int i = left; i<=right; i++){
            a[i]=temp[i];
        }
    }

}