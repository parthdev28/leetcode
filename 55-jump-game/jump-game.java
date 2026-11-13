class Solution {
    public boolean canJump(int[] nums) {
        int maxIndexReached = 0;
        for(int i = 0; i < nums.length - 1; i++){
            maxIndexReached = Math.max(maxIndexReached, i +  nums[i]);
            if(nums[i] == 0 && maxIndexReached < i + 1){
                return false;                
            }
        }
        return true;
    }
}