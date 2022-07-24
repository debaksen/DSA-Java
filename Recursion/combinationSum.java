class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> sList = new ArrayList<>();
        combinationHelper(candidates,target,0,sList,resList);
        return resList;
    }
    
    public static void combinationHelper(int[] arr, int target,int idx, List<Integer> sList, List<List<Integer>> resList){
        
        if(target == 0){
         resList.add(new ArrayList(sList));
         return;
        }
        
        if(idx == arr.length) return;
        
        if(arr[idx] <= target){
        sList.add(arr[idx]);
        combinationHelper(arr,target-arr[idx],idx,sList,resList);
        sList.remove(sList.size()-1);
        }
        combinationHelper(arr,target,idx+1,sList,resList);
        
    }
}