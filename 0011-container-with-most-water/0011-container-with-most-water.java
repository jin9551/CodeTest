class Solution {
    public int maxArea(int[] height) {
        System.out.println(Arrays.toString(height));
        int n = height.length;

        int maxV = 0;
        int start = 0;
        int end = n-1;


        while(start<end){
            int temp =0;
            if(height[start]>height[end]){
                temp = height[end] * Math.abs(start-end);
                end--;
            } else {
                temp = height[start] * Math.abs(start-end);
                start++;
            }
            if(temp > maxV){
                maxV = temp;
            }
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