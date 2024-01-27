class Solution {
    public int jump(int[] nums) {
        int jump=0, l=0, r=0, max=0;
        while (r<nums.length-1){
            max = 0;
            for (int i=l; i<=r; i++)
                max = Math.max(max, i+nums[i]);
            l = r+1;
            r = max;
            jump++;
        }
        return jump;
    }
}