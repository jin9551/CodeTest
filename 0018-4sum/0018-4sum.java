import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

return new AbstractList<List<Integer>>(){
            private List<List<Integer>> result;
            int n=nums.length;

            public List<Integer> get(int i){
                init();
                return result.get(i);
            }

            public int size(){
                init();
                return result.size();
            }

            public void init(){
                if(result!=null) return;

                Arrays.sort(nums);
                result=new ArrayList<>();

                for(int i=0;i<n-3;i++){
                    if(i>0 && nums[i]==nums[i-1]) continue;
                    for(int j=i+1;j<n-2;j++){
                        if(j>i+1 && nums[j]==nums[j-1]) continue;
                        int l=j+1, r=n-1;
                        while(l<r){
                            long s=(long)nums[i]+nums[j]+nums[l]+nums[r];
                            if(s==target){
                                result.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                                do l++; while(l<r && nums[l]==nums[l-1]);
                                do r--; while(l<r && nums[r]==nums[r+1]);
                            }else if(s<target)
                            l++;
                            else r--;
                        }
                    }
                }
            }
        };
    }
}