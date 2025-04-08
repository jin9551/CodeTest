class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int maxV = 0;
        int start = 0;
        int end = n-1;
        int temp = 0;

        while(start<end){
            if(height[start]>height[end]){  
                temp =   height[end] * (end-start);
                end--;
            } else {
                temp = height[start] * (end-start);
                start++;
            }
            maxV=Math.max(temp,maxV);
        }

        // for(int i=0; i<n;i++){
        //     for(int j=0; j<n;j++) {
        //         if(j!=i) {
        //             int temp =0;
        //             if(height[i]>height[j]){
        //                 temp = height[j] * Math.abs(i-j);
        //             } else {
        //                 temp = height[i] * Math.abs(i-j);
        //             }
        //             if(temp > maxV){
        //                 maxV = temp;
        //             }
        //         }
        //     }
        // }

        return maxV;
    }
}