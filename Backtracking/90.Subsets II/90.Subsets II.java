class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,-1);
        return ans;
    }
    public void backtrack(int[]nums, int j){
        ans.add(new ArrayList<>(list));
        for(int i = j+1;i < nums.length;i++){
            if(i > j +1 && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            backtrack(nums,i);
            list.remove(list.size()-1);
        }
    }
}
