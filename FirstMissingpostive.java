import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0) set.add(nums[i]);
        }
        int target=1;
        if(set == null) return target;
        for(int num:set){
            if(target!=num) return target;
            target++;
        }
        return target;
    }
}
