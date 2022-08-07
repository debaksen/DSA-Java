import java.util.*;

public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> res = new ArrayList();
        Arrays.sort(num);
        subsetHelper(num,0,0,new ArrayList<Integer>(),res);
        Collections.sort(res);
        return res;
    }
    
    public static void subsetHelper(int nums[], int idx,int sum, ArrayList<Integer> buffer, ArrayList<Integer> res){
        if(idx == nums.length){
           res.add(sum);
           return;
        }
        
        buffer.add(nums[idx]);
        subsetHelper(nums,idx+1,sum+nums[idx],buffer,res);
        buffer.remove(buffer.size()-1);
        subsetHelper(nums,idx+1,sum,buffer,res);
        
    }

}