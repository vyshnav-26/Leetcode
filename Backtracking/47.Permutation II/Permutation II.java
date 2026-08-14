class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[]bool = new boolean[nums.length];
        backtrack(nums,bool);
        return ans;
    }
    public void backtrack(int[]nums,boolean[]bool){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
        }
        for(int i = 0;i<nums.length;i++){
            if(bool[i] || (i > 0 && nums[i] == nums[i-1] && !bool[i-1])) continue;
            list.add(nums[i]);
            bool[i] = true;
            backtrack(nums,bool);
            bool[i] = false;
            list.remove(list.size()-1);
        }
    }
}