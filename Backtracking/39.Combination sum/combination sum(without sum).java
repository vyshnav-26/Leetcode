class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates,target,0);
        return ans;
    }
    public void backtrack(int[]candidates,int target,int start){
        if(target < 0) return;
        else if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = start;i<candidates.length;i++){
            list.add(candidates[i]);
            backtrack(candidates,target - candidates[i],i);
            list.remove(list.size()-1);
        }
    }
}

// here instead of using sum i have subrated from target.