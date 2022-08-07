class permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permuteHelper(nums,0,res);
        return res;
    }
    
    public static void permuteHelper(int[] nums, int idx, List<List<Integer>> res){
        if(idx == nums.length){
            List<Integer> bres = new ArrayList();
            for(int ele : nums){
                bres.add(ele);
            }
            
            res.add(bres);
            return;
        }
        
        for(int i=idx;i<nums.length;i++){
            swap(idx,i,nums);
            permuteHelper(nums,idx+1,res);
            swap(idx,i,nums);
        }
    }
    
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}