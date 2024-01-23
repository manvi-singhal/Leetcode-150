class Solution {
    public void rotate(int[] nums, int k) {
        int nums2[]=nums.clone();
        for (int i=0; i<nums.length; i++)
            nums[(i+k)%nums.length]=nums2[i];
    }
}

//uses addtional memory