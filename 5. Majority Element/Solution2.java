class Solution {
    public int majorityElement(int[] nums) {
        int x=nums[0],c=1;
        for (int i=1; i<nums.length; i++){
            if (c==0){
                x=nums[i];
                c=1;
            }  
            else if (x==nums[i])
                c++;
            else
                c--;
        }
        return x;
    }
}

// Moore's Voting Algorithm
// O(N)
// Runtime: 1 ms