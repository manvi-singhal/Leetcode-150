class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for (int i=0; i<nums.length; i++){
            if (k==0 || k==1 || nums[k-2]!=nums[i])
                nums[k++]=nums[i];
        }
        return k;
    }
}
