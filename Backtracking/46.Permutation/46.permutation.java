class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {    
        boolean[]bool = new boolean[nums.length];
        backtrack(nums,bool);
        return ans;
    }
    
    public void backtrack(int[]nums, boolean[]bool){
        if(list.size() == nums.length){
            ans.add(new ArrayList(list));
        }
        for(int i = 0;i<nums.length;i++){
            if(bool[i]) continue;
            bool[i] = true;
            list.add(nums[i]);
            backtrack(nums,bool);
            list.remove(list.size()-1);
            bool[i] = false;
        }
    }
}