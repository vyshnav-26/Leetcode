class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int sum = 0;
        backtrack(candidates,target,sum,0);
        return ans;
    }
    public void backtrack(int[]candidates,int target,int sum,int j){
        if(sum > target) return;
        else if(sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = j;i<candidates.length;i++){
            list.add(candidates[i]);
            backtrack(candidates,target,sum + candidates[i],i);
            list.remove(list.size()-1);
        }
    }
}