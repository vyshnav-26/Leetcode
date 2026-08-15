class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,target,0);
        return ans;
    }
    public void backtrack(int[]candidates,int target,int start){
        if(target < 0) return;
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = start;i<candidates.length;i++){
            if(i > start && candidates[i] == candidates[i-1]) continue;
            if(target - candidates[i] < 0) return;
            list.add(candidates[i]);
            backtrack(candidates,target - candidates[i],i+1);
            list.remove(list.size()-1);
        }
    }
}

// Here Instead of adding in sum i subracted directly in target
// 