class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else map.put(nums[i], map.get(nums[i])+1);
        }
        for(Map.Entry<Integer, Integer> x:map.entrySet()){
            if(x.getValue() == nums.length/2) return x.getKey();
        }
        return 0;
    }
}