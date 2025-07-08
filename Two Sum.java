class Solution {
    public int[] twoSum(int[] nums, int target) {
//store the elements for a lookup later
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            //current value which is i
            int curr = nums[i];
            //target = curr + x
            int x = target - curr;
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(curr,i);
        }
        return null;
    }
}
