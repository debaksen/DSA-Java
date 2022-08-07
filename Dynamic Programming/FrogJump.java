public class Solution {
    public static int frogJump(int n, int heights[]) {
        int[] dp = new int[n];
        return solveFrogDp(n-1,heights,dp);
        
    }
    
    public static int solveFrog(int n, int heights[], int[] dp){
        if(n==0) return 0;  
        
        if(dp[n] > 0) return dp[n];
        
        int h1 = solveFrog(n-1, heights,dp) + Math.abs(heights[n] - heights[n-1]);
        int h2 = Integer.MAX_VALUE;
        if(n > 1){
        h2 = solveFrog(n-2,heights,dp) + Math.abs(heights[n] - heights[n-2]);
        }
        
        dp[n] = Math.min(h1,h2);
        return dp[n];
    }
    
    public static int solveFrogDp(int n, int heights[], int[] dp){
        dp[0] = 0;
        for(int i=1;i<=n;i++){
        int fs = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
        int ss = Integer.MAX_VALUE;
        if(i > 1) ss = dp[i-2] +  Math.abs(heights[i] - heights[i-2]);
            
         dp[i] = Math.min(fs,ss);
        }
 
        return dp[n];
    }

}