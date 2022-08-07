class Solution {
    // Tabulation 
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            int pick = nums[i];
            if(i > 1) pick += dp[i-2];
            int notpick = dp[i-1];
            dp[i] = Math.max(pick,notpick);
        }
        return dp[nums.length-1];
    }
    
    //Memoization 
    public static int houseRob(int[] nums, int n,int[] dp){
        dp[0] = nums[0];
        if(n < 0) return 0;
        if(dp[n] > -1) return dp[n];
        
        int pickEle = nums[n] + houseRob(nums,n-2,dp);
        int notPick = houseRob(nums,n-1,dp);
        
        int res = Math.max(pickEle,notPick);
        dp[n] = res;
        return dp[n];
    }
}