class Solution {
    public int majorityElement(int[] nums) {
        int max=nums[0];
        for (int i=0; i<nums.length-1; i++){
            int c=1;
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    c++;
                }
            }
            if (c>(int)Math.ceil(nums.length/2))
                max=nums[i];
        }
        return max;
    }
}

//noob approach
//  Runtime: 1905 ms
// O(N^2)